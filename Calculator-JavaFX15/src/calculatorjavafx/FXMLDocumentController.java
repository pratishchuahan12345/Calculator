
package calculatorjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField tf,tf2 ;
    
    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button six;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button equals;

    @FXML
    private Button zero;

    @FXML
    private Button clear;

    @FXML
    private Button plus;

    @FXML
    private Button mult;

    @FXML
    private Button minus;

    @FXML
    private Button one;
    
    @FXML
    private Button neg;
    
    @FXML
    private Button dot;
    
    @FXML
    private Button division;
    
    @FXML
    private Button power;
    
    @FXML
    private Button remainder;
    
    @FXML
    private Button and;
    
    @FXML
    private Button or;
    
    @FXML
    private Button shift;
    
    @FXML
    private Button xor;
    
    @FXML
    private Button root;
    
   
    
    
  
    private int operator ;
    double a,b;
    double result;
    String prevStr="";
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String str = ((Labeled)event.getSource()).getText();
        tf.setText(tf.getText()+str);
        tf2.setText(prevStr+str);
        prevStr = tf2.getText();
    }
    
    @FXML
    private void add(){
        try{
        	a = Double.parseDouble(tf.getText());
              operator = 1 ;
              tf2.setText(prevStr+"+");
              prevStr = tf2.getText();
          }catch(NumberFormatException e){
              System.out.println("Enter value First");
          }finally{
              tf.setText("");
          }
    }
    
    @FXML
    private void substract(){
          try{
        	  a = Double.parseDouble(tf.getText());
              operator = 2 ;
              tf2.setText(prevStr+"-");
              prevStr = tf2.getText();
          }catch(NumberFormatException e){
              System.out.println("Enter value First");
          }finally{
              tf.setText("");
          }
    }
    
    
  
    
    @FXML
    private void multiply(){
      try{
    	  a = Double.parseDouble(tf.getText());
            operator = 3 ;
            tf2.setText(prevStr+"*");
            prevStr = tf2.getText();
          }catch(NumberFormatException e){
            System.out.println("Enter value First");
        }finally{
             tf.setText("");
        }
    }
    
    
    @FXML
    private void remainder(){
          try{
        	  a = Double.parseDouble(tf.getText());
              operator = 4 ;
              tf2.setText(prevStr+"%");
              prevStr = tf2.getText();
          }catch(NumberFormatException e){
              System.out.println("Enter value First");
          }finally{
              tf.setText("");
          }
    }
   
    @FXML
    private void clearText(){
        tf.setText("");
        tf2.setText("");
        prevStr="";
    }
    
    @FXML
    private void divide(){
         try{
        	 a = Double.parseDouble(tf.getText());
            operator = 12 ;
            tf2.setText(prevStr+"/");
            prevStr = tf2.getText();
        }catch(NumberFormatException e){
            System.out.println("Enter value First");
        }finally{
            tf.setText("");
        }
    }
   
    @FXML
    private void power(){
         try{
        	 a = Double.parseDouble(tf.getText());
            operator = 5 ;
            tf2.setText(prevStr+"^");
            prevStr = tf2.getText();
        }catch(NumberFormatException e){
            System.out.println("Enter value First");
        }finally{
            tf.setText("");
        }
    }
    
    @FXML
    private void bitand(){
          try{
        	  a = Double.parseDouble(tf.getText());
              operator = 6 ;
              tf2.setText(prevStr+"&");
              prevStr = tf2.getText();
          }catch(NumberFormatException e){
              System.out.println("Enter value First");
          }finally{
              tf.setText("");
          }
    }

    @FXML
    private void bitor(){
          try{
        	  a = Double.parseDouble(tf.getText());
              operator = 7;
              tf2.setText(prevStr+"|");
              prevStr = tf2.getText();
          }catch(NumberFormatException e){
              System.out.println("Enter value First");
          }finally{
              tf.setText("");
          }
    }
    
    @FXML
    private void bitxor(){
          try{
        	  a = Double.parseDouble(tf.getText());
              operator = 8 ;
              tf2.setText(prevStr+"^");
              prevStr = tf2.getText();
          }catch(NumberFormatException e){
              System.out.println("Enter value First");
          }finally{
              tf.setText("");
          }
    }
    
    @FXML
    private void right(){
      try{
    	  a = Double.parseDouble(tf.getText());
            operator = 9 ;
            tf2.setText(prevStr+">>");
            prevStr = tf2.getText();
          }catch(NumberFormatException e){
            System.out.println("Enter value First");
        }finally{
             tf.setText("");
        }
    }
    
    @FXML
    private void left(){
      try{
    	  a = Double.parseDouble(tf.getText());
            operator = 10 ;
            tf2.setText(prevStr+"<<");
            prevStr = tf2.getText();
          }catch(NumberFormatException e){
            System.out.println("Enter value First");
        }finally{
             tf.setText("");
        }
    }
    
    
    @FXML
    private void root(){
        try{
        	a = Double.parseDouble(tf.getText());
              operator = 11;
              tf2.setText(prevStr+"root");
              prevStr = tf2.getText();
          }catch(NumberFormatException e){
              System.out.println("Enter value First");
          }finally{
              tf.setText("");
          }
    }
    
    @FXML
    private void equals(){
    try{
              b = Double.parseDouble(tf.getText());
              
              switch(operator){
              case 1 : result = a + b ; tf.setText(""+result);  break;
              case 2 : result = a - b;  tf.setText(""+result);  break;
              case 3 : result = a * b; tf.setText(""+result);  break;
              case 4: result= a % b;  tf.setText(""+result);  break;
              case 5:  result= Math.pow(a,b);  tf.setText(""+result);  break;
              case 6:  { 
            	             int p=(int)(a);
                             int q=(int)(b);
                             result=p & q;
                            tf.setText(""+result);
               
                        }    break;        
                        
              case 7:  { 
 	             int p=(int)(a);
                  int q=(int)(b);
                  result=p | q;
                 tf.setText(""+result);
    
             }    break; 
              case 8:  { 
  	             int p=(int)(a);
                   int q=(int)(b);
                   result=p ^ q;
                  tf.setText(""+result);
     
              }    break;
              
              case 9:  { 
    	             int p=(int)(a);
                    int q=(int)(b);
                    result=p>>q;
                   tf.setText(""+result);
      
               }    break;
              
              case 10:  { 
   	             int p=(int)(a);
                   int q=(int)(b);
                   result=p<<q;
                  tf.setText(""+result);
              }    break;
              
              case 11: { 
            	         if(b==2)
            	        	 result=Math.sqrt(a);
            	        	 else
            	        		 result=Math.cbrt(a);
            	         tf.setText(""+result); 
                     }      break;
                     
              
              case 12 : try{
                        result = a/b ;
                        tf.setText(""+result);
                        
                      }catch(Exception e){
                          tf.setText("Error");
                      }
            }
             tf2.setText(prevStr+"="+result);
             
                
          
          }catch(NumberFormatException e){
              System.out.println("Select values First");
          }
}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
