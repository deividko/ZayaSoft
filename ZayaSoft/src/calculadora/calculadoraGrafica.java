package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadoraGrafica {

	private JFrame frame;
	private JTextField caja;
    private double op1=0;
    private double op2 = 0;
    private String operacion = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadoraGrafica window = new calculadoraGrafica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculadoraGrafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                boolean nueva = false;
				if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"1");
            }
        });
		button.setBounds(31, 86, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                boolean nueva = false;
				if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"2");
            }
        });
		button_1.setBounds(131, 86, 89, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                boolean nueva = false;
				if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"3");
            }
        });
		button_2.setBounds(31, 120, 89, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                boolean nueva = false;
				if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"4");
            }
        });
		button_3.setBounds(131, 120, 89, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		 button_4.addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent evt){
	                boolean nueva = false;
					if(nueva){caja.setText("");nueva=false;}
	                caja.setText(caja.getText()+"5");
	            }
	        });
		button_4.setBounds(31, 154, 89, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                boolean nueva = false;
				if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"6");
            }
        });
		button_5.setBounds(131, 154, 89, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                boolean nueva = false;
				if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"7");
            }
        });
		button_6.setBounds(31, 188, 89, 23);
		frame.getContentPane().add(button_6);		
		
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                boolean nueva = false;
				if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"8");
            }
        });
		button_7.setBounds(131, 188, 89, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("9");
		 button_8.addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent evt){
	                boolean nueva = false;
					if(nueva){caja.setText("");nueva=false;}
	                caja.setText(caja.getText()+"9");
	            }
	        });
		button_8.setBounds(31, 222, 89, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("0");
		 button_9.addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent evt){
	                boolean nueva = false;
					if(nueva){caja.setText("");nueva=false;}
	                caja.setText(caja.getText()+"0");
	            }
	        });
		button_9.setBounds(131, 222, 89, 23);
		frame.getContentPane().add(button_9);
		
		caja = new JTextField();
		caja.setBounds(129, 11, 200, 50);
		frame.getContentPane().add(caja);
		caja.setColumns(10);
		
		JButton button_10 = new JButton("+");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt){          
                   
					if(op1!=0){
                        op1=op1+Double.parseDouble(caja.getText());
					} else{
                        op1=Double.parseDouble(caja.getText());
					}
                    operacion="suma";
                    caja.setText("");                
            }			
		});
		
		
		button_10.setBounds(240, 86, 89, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt){          
                   
					if(op1!=0){
                        op1=op1-Double.parseDouble(caja.getText());
					} else{
                        op1=Double.parseDouble(caja.getText());
					}
                    operacion="resta";
                    caja.setText("hola");  
                    
            }			
		});
		button_11.setBounds(240, 120, 89, 23);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("*");
		button_11.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                
                    if(op1!=0){
                        op1=op1*Double.parseDouble(caja.getText());
                    }else{
                        op1=Double.parseDouble(caja.getText());
                    }
                    operacion="multiplicacion";
                    caja.setText("");
                
            }
        });


		button_12.setBounds(345, 86, 89, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("/");
		 button_13.addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent evt){
	                try{
	                    double op1 = 0;
						if(op1!=0)
	                        op1=op1/Double.parseDouble(caja.getText());
	                    else
	                        op1=Double.parseDouble(caja.getText());
	                    String operacion = "division";
	                    caja.setText("");
	                }catch(Exception err){}
	            }
	        });
		button_13.setBounds(345, 120, 89, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                
				try{
                    op2=Double.parseDouble(caja.getText());
                }catch(Exception err){}
                
				
				if(operacion.equals("suma")){
                    double res=op1+op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("resta")){
                    double res=op1-op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("multiplicacion")){
                    double res=op1*op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("division")){
                    double res=op1/op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }
                boolean nueva = true;
            }
        });

		button_14.setBounds(272, 218, 118, 30);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton(".");
		button_15.setBounds(240, 166, 89, 23);
		frame.getContentPane().add(button_15);
		
		JButton btnCe = new JButton("CE");
		btnCe.setBounds(345, 166, 89, 23);
		frame.getContentPane().add(btnCe);
	}
}
