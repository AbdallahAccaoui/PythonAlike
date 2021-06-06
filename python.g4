grammar python; 

options {
	language=Java;
}

@members {
	java.util.Map<String, java.util.ArrayList<Object>> idToList = new java.util.HashMap<>();
}

prog: stat+;

stat: assign
	| declare
	| appendInsertRemove
	| concatenation
	| slicing
	| comprehension
	;
	

comprehension @init{ 
					java.util.ArrayList<Object> newListt = new java.util.ArrayList<>();
				     boolean cond=false; 
					}
			  @after{
			         System.out.println(java.util.Arrays.toString(newListt.toArray()));
					}
					: ID {idToList.put($ID.text, newListt);} '=' '[' expression 'for'
             		  ID {if ($ID.text != $expression.variablee) System.out.println("index variable does not match with expression");}
					  'in' ID 'if' condition ']' 
					{
					  java.util.ArrayList<Object> arList = idToList.get($ID.text);
					  for(int i=0; i<arList.size();i++){
					      Object obj = arList.get(i);
						  Integer oper1 =null; 
						  Integer oper2 = null;
					      if($condition.operand1.equals("len")){
							
						     if(obj instanceof String){
							   String temp = (String) obj;
							   oper1 = new Integer(temp.length()-2);
							 }else if(obj instanceof java.util.ArrayList){
							   java.util.ArrayList<Object> temp = (java.util.ArrayList<Object>) obj;
							   oper1 = new Integer(temp.size());
							 }
						  }else if ($condition.operand1.equals("abs")){
							  if(obj instanceof Integer){
								int temp= (Integer) obj;
							    oper1 = new Integer(Math.abs(temp));
							  }
						  }else {
							oper1 = new Integer($condition.int1);
						  }
						  
						  if($condition.operand2 != null){
							if($condition.operand2.equals("len")){
								if(obj instanceof String){
									String temp = (String) obj; 
									oper2 = new Integer(temp.length());
								}else if(obj instanceof java.util.ArrayList){
									java.util.ArrayList<Object> temp = (java.util.ArrayList<Object>) obj;
									oper2 = new Integer(temp.size());
								}
							}else if ($condition.operand2.equals("abs")){
								if(obj instanceof Integer){
							    int temp= (Integer) obj;
							    oper2 = new Integer(Math.abs(temp));
							  }
							}
						  }else {
								oper2 = new Integer($condition.int2);
							}
						  
						  if($condition.op.equals("==")) cond = oper1 == oper2;
						  else if($condition.op.equals("!=")) cond = oper1 != oper2;
						  else if($condition.op.equals("<")) cond = oper1 < oper2;
						  else if($condition.op.equals(">")) cond = oper1 > oper2;
						  else if($condition.op.equals("<=")) cond = oper1 <= oper2;
						  else if($condition.op.equals(">=")) cond = oper1 >= oper2;
						  
						if(cond){
						  if($expression.function ==null){
						     newListt.add(obj);
						  }else{
								if($expression.function.equals("max") && obj instanceof String){
									char max = 'A';
									String temp = (String) obj;
									for (int j=0; j<temp.length();j++){
									     if(temp.charAt(j) >max){
										    max = temp.charAt(j);
										 }
									}
									newListt.add(max);
								}
								else if($expression.function.equals("len")){
									if(obj instanceof String) {
									  String temp = (String) obj;
									  newListt.add(temp.length());
									}else if(obj instanceof java.util.ArrayList){
									  java.util.ArrayList<Object> temp = (java.util.ArrayList<Object>) obj;
									  newListt.add(temp.size());
									}
								}
								else if($expression.function.equals("abs")){
									if(obj instanceof Integer){
										Integer temp = (Integer) obj;
										newListt.add(temp);
										}
									}
								}
						}
					  }
					  
					}
					;
					
expression returns [String variablee, String function] 
                    : ID {$variablee = $ID.text;}
					| (funct = ('max'|'len'| 'abs')) '(' ID ')'
					 {
					   $function = $funct.text;
					   $variablee = $ID.text;
					 }
					 ;

condition returns [String operand1, Integer int1,
                   String op, 
				   String operand2, Integer int2,
				   String variable1, String variable2]			
         : 
		 (INT | (funct1 = ('len'|'abs') '(' ID ')'))
		 {   
		     $operand1 = $funct1.text;
			 
			 if($INT.text != null) $int1 = new Integer(Integer.parseInt($INT.text));
			 $variable1 = $ID.text;			 
		 }
		 oper=('=='|'!='|'<'|'>'|'<='|'>=')
		 (INT | (funct2 = ('len'|'abs') '(' ID ')')) 
		 {   
		     $op = $oper.text;
		     $operand2 = $funct2.text;
			 if($INT.text != null) $int2 = new Integer(Integer.parseInt($INT.text));
			 $variable2 = $ID.text;	
			 if ($variable1 == null && $variable2==null) System.out.println("error");
			 if ($variable1 !=null && $variable2 != null && !$variable1.equals($variable2))
			     System.out.println("error2");
		 }
		 ;					

slicing	@init{
				java.util.ArrayList<Object> newListt = new java.util.ArrayList<>();
				Integer beginIndex= new Integer(0);
				Integer endIndex;
				java.util.ArrayList<Object> gettt;
			  }
		@after{
		        for(int i=beginIndex; i<endIndex;i++){
				  newListt.add(gettt.get(i));
				}
				System.out.println("Slicing");
				System.out.println(java.util.Arrays.toString(newListt.toArray()));
		      }
			  : ID {idToList.put($ID.text, newListt);} '=' ID {
			                                                   gettt = idToList.get($ID.text);
															   endIndex = new Integer(gettt.size());
															  } '[' (INT {
																			beginIndex = new Integer(Integer.parseInt($INT.text));
															              })? ':' (INT {
																		                 endIndex= new Integer(Integer.parseInt($INT.text));
																		                })? ']';
				
concatenation @init{
                      java.util.ArrayList<Object> newList = new java.util.ArrayList<>();
					}
			  @after{
			          System.out.println(java.util.Arrays.toString(newList.toArray()));
			        }
				   : ID {idToList.put($ID.text, newList);} '=' (ID {	
																	 java.util.ArrayList<Object> arlist = idToList.get($ID.text);
																	 for (int i=0; i<arlist.size();i++){
																	    newList.add(arlist.get(i));
																	 }
				                                                   } | list {
																              for (int i=0; i<$list.newList.size();i++){
																				newList.add($list.newList.get(i));
																			   }
																            })
																			
																'+' 
																(ID {
                                                                       java.util.ArrayList<Object> arlist = idToList.get($ID.text);
																	    for (int i=0; i<arlist.size();i++){
																			newList.add(arlist.get(i));
																	    }
																	} | list {
 																	           for (int i=0; i<$list.newList.size();i++){
																				newList.add($list.newList.get(i));
																			   }
																			 }
																);
																

appendInsertRemove: ID '.' (word= ('append' | 'remove'| 'insert')) '(' (INT ',')? value ')' 
					 {
						System.out.println("appendinsertremove");
						java.util.ArrayList<Object> gett = idToList.get($ID.text);
						if(gett != null) {
							if($word.text.equals("append")){
								if($value.str !=null) gett.add($value.str);
								else if($value.in !=null) gett.add($value.in);
								else if($value.listt!=null) gett.add($value.listt);
							} else if($word.text.equals("remove")){
								if($value.str !=null) gett.remove($value.str);
								else if($value.in !=null) gett.remove($value.in);
								else if($value.listt!=null) gett.remove($value.listt);
							} else if($word.text.equals("insert")){
								if($value.str !=null) gett.add(Integer.parseInt($INT.text),$value.str);
								else if($value.in !=null) gett.add(Integer.parseInt($INT.text),$value.in);
								else if($value.listt!=null) gett.add(Integer.parseInt($INT.text),$value.listt);
							}
							
							
						}
						System.out.println(java.util.Arrays.toString(gett.toArray()));
					 };
	
assign:	 ID '[' INT ']' '=' value {
                                    System.out.println("Assign");
									java.util.ArrayList<Object> gett = idToList.get($ID.text);
									if(gett != null) {
										if($value.str !=null) gett.set(Integer.parseInt($INT.text),$value.str);
										else if($value.in !=null) gett.set(Integer.parseInt($INT.text),$value.in);
										else if($value.listt!=null) gett.set(Integer.parseInt($INT.text),$value.listt);
									}
									System.out.println(java.util.Arrays.toString(gett.toArray()));
								   }; 

declare :  ID '=' list {
			System.out.println("Finished declaring a list");
			java.util.ArrayList<Object> ids = new java.util.ArrayList<>();
			for(int i=0; i< $list.newList.size();i++){
			    ids.add(i,$list.newList.get(i));
			}
			idToList.put($ID.text, ids);
			System.out.println(java.util.Arrays.toString(ids.toArray()));
		}
		;

		
list returns [java.util.ArrayList<Object> newList]
		@init{
				java.util.ArrayList<Object> Alist = new java.util.ArrayList<>();
				System.out.println("List created");
		}
		: 
		 '[' (value {
					  if($value.str !=null) Alist.add($value.str);
                      else if($value.in !=null)	Alist.add($value.in);
                      else if($value.listt!=null) Alist.add($value.listt);					  
					} (',' value{
								 if($value.str !=null) Alist.add($value.str);
								 else if($value.in!=null)	Alist.add($value.in);
								 else if($value.listt!=null) Alist.add($value.listt);
								}
								)*)* ']' {
								            $newList = Alist;
									     }
		
		;

value returns 
		[String str, 
		 Integer in,
		 java.util.ArrayList<Object> listt]
		: 
		  list {
				 $listt = $list.newList;	
		       }   
		| STRING {$str= $STRING.text; 
		         }
		| INT {String s = $INT.text.trim();
			   $in= new Integer(Integer.parseInt(s));
		       }
		;
	
	
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
STRING : '"' .*? '"' ; 
INT	: [0-9]+;
WS	: (' '|'\t'|'\n'|'\r')+ {skip();};