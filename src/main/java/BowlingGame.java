public class BowlingGame {

    public int getBowlingScore(String bowlingCode) {
       String[] AddArray=bowlingCode.split("\\|\\|",2);//去掉|过后的字符串
			
			String[] Array=AddArray[0].split("\\|");
			
			int sum=0;
			int[] value=new int[22];
			
			int i;
			for(i=0;i<22;i++){//				
				//字符串处理成值
				if( Array[i] == "X"){
					value[i]=10 ;
					value[i+1]=0;
					i++;
				}
				else if(Array[i] == "/" ){
					value[i]=10-value[i-1];
				}
				
				else if( Array[i] == "-"){
					value[i]=0;
				}
				else {
					value[i]=Integer.parseInt(Array[i]);
				}
				
				if(Array[19] == "/")
				 {  
				 	if(  AddArray[1].charAt(0) == 'X'){
						value[i]=10 ;
						value[i+1]=0;
						i++;
					}
					else if(AddArray[1].charAt(0) == '/' ){
						value[i]=10-value[i-1];
					}
					
					else if( AddArray[1].charAt(0) == '-'){
						value[i]=0;
					}
					else {
						value[i]=Integer.parseInt(Array[i]);
					}
				}
				else if(Array[19] == "X")
				 { 

				 	if(  AddArray[1].charAt(0) == 'X'){
						value[i]=10 ;
						value[i+1]=0;
						i++;
					}
					else if(AddArray[1].charAt(0) == '/' ){
						value[i]=10-value[i-1];
					}
					
					else if( AddArray[1].charAt(0) == '-'){
						value[i]=0;
					}
					else {
						value[i]=Integer.parseInt(Array[i]);
					}
				 	

				 	if(  AddArray[1].charAt(1) == 'X'){
						value[i]=10 ;
						value[i+1]=0;
						i++;
					}
					else if(AddArray[1].charAt(1) == '/' ){
						value[i]=10-value[i-1];
					}
					
					else if( AddArray[1].charAt(1) == '-'){
						value[i]=0;
					}
					else {
						value[i]=Integer.parseInt(Array[i]);
					}
					
				}
				else{
					value[20]=0 ;
					value[21]=0;
				}
				
							
			}
					
			//截止到最后两个字符Array.length-2
			//字符串对应每个分数计算
			
			
			for(int k=0;k<20;k++){				
				sum+=value[k+0]+value[k+1]+value[k+2];						
			}	
			
			//返回总值
			
			

		   return sum;
    }
}
