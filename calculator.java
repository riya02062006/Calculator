

Skip to content
Using Gmail with screen readers
Conversations
17% of 15 GB used
Terms · Privacy · Programme Policies
Last account activity: 1 minute ago
Details
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class calculator implements ActionListener {
	JFrame jf;
        Double result;
        char op;
        Double num1,num2;
	JLabel displayLabel;
	Boolean isOperatorClicked=false;
	JButton sevenButton,eightButton,nineButton,fourButton,fiveButton,sixButton;
	JButton oneButton,twoButton,threeButton,equalsButton,zeroButton,dotButton;
	JButton clrButton,delButton,addButton,subButton,divButton,multButton;
	public calculator(){
		jf=new JFrame("CALCULATOR");
		jf.setSize(500,500);
		jf.setLocation(200,150);
		displayLabel=new JLabel();
		displayLabel.setBounds(30,50,250,40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		jf.add(displayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30,120,50,50);
		jf.add(sevenButton);
		sevenButton.addActionListener(this);
		
		
		eightButton=new JButton("8");
		eightButton.setBounds(100,120,50,50);
		jf.add(eightButton);
		eightButton.addActionListener(this);
		
		nineButton=new JButton("9");
		nineButton.setBounds(170,120,50,50);
		jf.add(nineButton);
		nineButton.addActionListener(this);
		
		addButton=new JButton("+");
		addButton.setBounds(240,120,50,50);
		jf.add(addButton);
		addButton.addActionListener(this);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30,180,50,50);
		jf.add(fourButton);
		fourButton.addActionListener(this);
		
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(100,180,50,50);
		jf.add(fiveButton);
		fiveButton.addActionListener(this);
		
		
		sixButton=new JButton("6");
		sixButton.setBounds(170,180,50,50);
		jf.add(sixButton);
		sixButton.addActionListener(this);
		
		
		subButton=new JButton("-");
		subButton.setBounds(240,180,50,50);
		jf.add(subButton);
		subButton.addActionListener(this);
		
		
		oneButton=new JButton("1");
		oneButton.setBounds(30,240,50,50);
		jf.add(oneButton);
		oneButton.addActionListener(this);
		
		
		twoButton=new JButton("2");
		twoButton.setBounds(100,240,50,50);
		jf.add(twoButton);
		twoButton.addActionListener(this);
		
		
		threeButton=new JButton("3");
		threeButton.setBounds(170,240,50,50);
		jf.add(threeButton);
		threeButton.addActionListener(this);
		
		
		multButton=new JButton("*");
		multButton.setBounds(240,240,50,50);
		jf.add(multButton);
		multButton.addActionListener(this);
		
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(30,300,50,50);
		jf.add(zeroButton);
		zeroButton.addActionListener(this);
		
		
		dotButton=new JButton(".");
		dotButton.setBounds(100,300,50,50);
		jf.add(dotButton);
		dotButton.addActionListener(this);
		
		
		equalsButton=new JButton("=");
		equalsButton.setBounds(170,300,50,50);
		jf.add(equalsButton);
		equalsButton.addActionListener(this);
		
		
		divButton=new JButton("/");
		divButton.setBounds(240,300,50,50);
		jf.add(divButton);
		divButton.addActionListener(this);
		
		clrButton=new JButton("Clear");
		clrButton.setBounds(30,360,120,50);
		jf.add(clrButton);
		clrButton.addActionListener(this);
		
		delButton=new JButton("Del");
		delButton.setBounds(170,360,120,50);
		jf.add(delButton);
		delButton.addActionListener(this);
		
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	       }
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==sevenButton){
			displayLabel.setText(displayLabel.getText()+"7");
                         }

		if(e.getSource()==eightButton){
                     displayLabel.setText(displayLabel.getText()+"8");
                         }
		if(e.getSource()==nineButton){
                      displayLabel.setText(displayLabel.getText()+"9");
		}
		if(e.getSource()==addButton){
		 num1=Double.parseDouble(displayLabel.getText());
			op='+';
			displayLabel.setText(" ");
			}
		
		if(e.getSource()==fourButton){
                      displayLabel.setText(displayLabel.getText()+"4");
                         }
                 if(e.getSource()==fiveButton){
			displayLabel.setText(displayLabel.getText()+"5");
                         }

		if(e.getSource()==sixButton){
			displayLabel.setText(displayLabel.getText()+"6");
                         }

		if(e.getSource()==subButton){
                    num1=Double.parseDouble(displayLabel.getText());
			displayLabel.setText(" ");
                        op='-';
                         }

		if(e.getSource()==oneButton){
			displayLabel.setText(displayLabel.getText()+"1");	
                      }	
                if(e.getSource()==twoButton){
                         displayLabel.setText(displayLabel.getText()+"2");	
                      }	

		if(e.getSource()==threeButton){
			displayLabel.setText(displayLabel.getText()+"3");	
                      }	
		if(e.getSource()==divButton){
                        num1=Double.parseDouble(displayLabel.getText());
                      op='/';
                       displayLabel.setText(" ");
                        }
		if(e.getSource()==multButton){
                       num1=Double.parseDouble(displayLabel.getText());
                       op='*';
                       displayLabel.setText(" ");
                        }

		if(e.getSource()==clrButton){
			displayLabel.setText("");
			}
		if(e.getSource()==delButton){

			if(displayLabel.getText().length()!=0){
			String temp=displayLabel.getText();
                        displayLabel.setText(temp.substring(0,temp.length()-1));		
		}
              }
             if(e.getSource()==dotButton){
              displayLabel.setText(displayLabel.getText()+".");
              }
              if(e.getSource()==zeroButton){
			displayLabel.setText(displayLabel.getText()+"0");	
                      }	

             


              if(e.getSource()==equalsButton){
                num2=Double.parseDouble(displayLabel.getText());
                if(op=='+')
                result=num1+num2;
                if(op=='-')
                result=num1-num2;
                if(op=='*')
                result=num1*num2;
                if(op=='/'){
                if(num2!=0)
                result=num1/num2;
               else
               result=0.0;
               
            }
displayLabel.setText(String.valueOf(result));
}
}
				
		
public static void main(String args[]){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new calculator();
}
});
}
}
