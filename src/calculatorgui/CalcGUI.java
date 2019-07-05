package calculatorgui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcGUI  implements ActionListener
{
    private double result = 0;
    private int chk = 0;
    private String op;
    
    private JFrame fCalc;
    private Container c;
    
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    private JButton plus, minus, mul, div;
    private JButton equal, clear;
    
    private JPanel pButtons;
    private JPanel pTxtfld;
    private JTextField op1, op2, ans;
    private JLabel lMyCalc;
    

    public JButton getB1() {
        return b1;
    }

    public JButton getB2() {
        return b2;
    }

    public JButton getB3() {
        return b3;
    }

    public JButton getB4() {
        return b4;
    }

    public JButton getB5() {
        return b5;
    }

    public JButton getB6() {
        return b6;
    }

    public JButton getB7() {
        return b7;
    }

    public JButton getB8() {
        return b8;
    }

    public JButton getB9() {
        return b9;
    }

    public JButton getB0() {
        return b0;
    }

    public JButton getPlus() {
        return plus;
    }

    public JButton getMinus() {
        return minus;
    }

    public JButton getMul() {
        return mul;
    }

    public JButton getDiv() {
        return div;
    }

    public JButton getEqual() {
        return equal;
    }

    public JButton getClear() {
        return clear;
    }

    public JTextField getOp1() {
        return op1;
    }

    public JTextField getOp2() {
        return op2;
    }

    public JTextField getAns() {
        return ans;
    }
 
    public void initGUI()
    {
        fCalc = new JFrame();
        c = fCalc.getContentPane();
        c.setLayout(new BorderLayout());
        
                
        setButtons();
        pButtons = new JPanel();
        pButtons.setLayout(new GridLayout(4,4));
        addButtonsToPanel();
        buttonsEventRegistration();
        c.add(pButtons, BorderLayout.CENTER);
        
        
        op1 = new JTextField();
        op2 = new JTextField();
        ans = new JTextField();
        pTxtfld = new JPanel();
        pTxtfld.setLayout(new GridLayout(3,1));
        pTxtfld.add(op1);
        pTxtfld.add(op2);
        pTxtfld.add(ans);
        c.add(pTxtfld, BorderLayout.NORTH);
        
        
        
        
        lMyCalc = new JLabel("MY CALCULATOR");
        c.add(lMyCalc, BorderLayout.SOUTH);
        
        fCalc.setVisible(true);
        fCalc.setSize(300, 300);
        
    }
    
    private void buttonsEventRegistration()
    {
        b0.addActionListener(this); b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this);
        b4.addActionListener(this); b5.addActionListener(this); b6.addActionListener(this); b7.addActionListener(this);
        b8.addActionListener(this); b9.addActionListener(this); plus.addActionListener(this); minus.addActionListener(this);
        mul.addActionListener(this); div.addActionListener(this); equal.addActionListener(this); clear.addActionListener(this);
    }
    
    public void setButtons()
    {
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        plus = new JButton("+");
        minus = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        equal = new JButton("=");
        clear = new JButton("C");
    }
    
    public void addButtonsToPanel()
    {
        pButtons.add(b1);
        pButtons.add(b2);
        pButtons.add(b3);
        pButtons.add(b4);
        pButtons.add(b5);
        pButtons.add(b6);
        pButtons.add(b7);
        pButtons.add(b8);
        pButtons.add(b9);
        pButtons.add(b0);
        pButtons.add(plus);
        pButtons.add(minus);
        pButtons.add(mul);
        pButtons.add(div);
        pButtons.add(equal);
        pButtons.add(clear);
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == getB0())
        {
            if(chk == 0)
            {
                getOp1().setText(getOp1().getText()+"0");
            }
            else
            {
                getOp2().setText(getOp2().getText()+"0");
            }
        }
        if(e.getSource() == getB1())
        {
            if(chk == 0)
            {
                getOp1().setText(getOp1().getText()+"1");
            }
            else
            {
                getOp2().setText(getOp2().getText()+"1");
            }
        }
        if(e.getSource() == getB2())
        {
            if(chk == 0)
            {
                getOp1().setText(getOp1().getText()+"2");
            }
            else
            {
                getOp2().setText(getOp2().getText()+"2");
            }
        }
        if(e.getSource() == getB3())
        {
            if(chk == 0)
            {
                getOp1().setText(getOp1().getText()+"3");
            }
            else
            {
                getOp2().setText(getOp2().getText()+"3");
            }
        }
        if(e.getSource() == getB4())
        {
            if(chk == 0)
            {
                getOp1().setText(getOp1().getText()+"4");
            }
            else
            {
                getOp2().setText(getOp2().getText()+"4");
            }
        }
        if(e.getSource() == getB5())
        {
            if(chk == 0)
            {
                getOp1().setText(getOp1().getText()+"5");
            }
            else
            {
                getOp2().setText(getOp2().getText()+"5");
            }
        }
        if(e.getSource() == getB6())
        {
            if(chk == 0)
            {
                getOp1().setText(getOp1().getText()+"6");
            }
            else
            {
                getOp2().setText(getOp2().getText()+"6");
            }
        }
        if(e.getSource() == getB7())
        {
            if(chk == 0)
            {
                getOp1().setText(getOp1().getText()+"7");
            }
            else
            {
                getOp2().setText(getOp2().getText()+"7");
            }
        }
        if(e.getSource() == getB8())
        {
            if(chk == 0)
            {
                getOp1().setText(getOp1().getText()+"8");
            }
            else
            {
                getOp2().setText(getOp2().getText()+"8");
            }
        }
        if(e.getSource() == getB9())
        {
            if(chk == 0)
            {
                getOp1().setText(getOp1().getText()+"9");
            }
            else
            {
                getOp2().setText(getOp2().getText()+"9");
            }
        }
        if(e.getSource() == getPlus())
        {
            result = Double.parseDouble(getOp1().getText());
            op = "+";
            chk = 1;
        }
        if(e.getSource() == getMinus())
        {
            result = Double.parseDouble(getOp1().getText());
            op = "-";
            chk = 1;
        }
        if(e.getSource() == getMul())
        {
            result = Double.parseDouble(getOp1().getText());
            op = "*";
            chk = 1;
        }
        if(e.getSource() == getDiv())
        {
            result = Double.parseDouble(getOp1().getText());
            op = "/";
            chk = 1;
        }
        if(e.getSource() == getEqual())
        {
            if(getOp1().getText()!="" && getOp2().getText()!="" && op=="+")
            {
                double temp = Double.parseDouble(getOp2().getText());
                result =  temp+result;
                getAns().setText("Sum: "+result);
                result = 0;
                chk = 0;
                op = null;
                
                //op1.setText("");
                //op2.setText("");
            }
            else if(getOp1().getText()!="" && getOp2().getText()!="" && op=="-")
            {
                double temp = Double.parseDouble(getOp2().getText());
                result =  result-temp;
                getAns().setText("Sub: "+result);
                result = 0;
                chk = 0;
                op = null;
                //op1.setText("");
                //op2.setText("");
            }
            else if(getOp1().getText()!="" && getOp2().getText()!="" && op=="*")
            {
                double temp = Double.parseDouble(getOp2().getText());
                result =  temp*result;
                getAns().setText("MUL: "+result);
                result = 0;
                chk = 0;
                op = null;
                //op1.setText("");
                //op2.setText("");
            }
            else if(getOp1().getText()!="" && getOp2().getText()!="" && op=="/")
            {
                double temp = Double.parseDouble(getOp2().getText());
                if(temp!=0)
                {
                    result =  result/temp;
                    getAns().setText("DIV: "+result);
                }
                else
                {
                    getAns().setText("DIVIDE BY ZERO. MATH ERROR");
                }
                
                result = 0;
                chk = 0;
                op = null;
                //op1.setText("");
                //op2.setText("");
            }
            else if(getOp1().getText()!="" && getOp2().getText()=="")
            {
                result = Double.parseDouble(getOp2().getText());
                getAns().setText("ANS: "+result);
                result = 0;
                chk = 0;
                //op1.setText("");
                //op2.setText("");
            }
            else if(getOp1().getText()=="" && getOp2().getText()!="")
            {
                result = Double.parseDouble(getOp1().getText());
                getAns().setText("ANS: "+result);
                result = 0;
                chk = 0;
                //op1.setText("");
                //op2.setText("");
            }
        }
        if(e.getSource() == getClear())
        {
            getAns().setText("");
            getOp1().setText("");
            getOp2().setText("");
            result = 0;
            chk = 0;
            op = null;
        }
    }
        
}
