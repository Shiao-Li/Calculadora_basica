import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora_basica {


    private JPanel Panel_calculadora;
    private JButton SieteButton;
    private JButton CuatroButton;
    private JButton OchoButton;
    private JButton NueveButton;
    private JButton RestaButton;
    private JButton CincoButton;
    private JButton SeisButton;
    private JButton MultiplicacionButton;
    private JButton UnoButton;
    private JButton DosButton;
    private JButton TresButton;
    private JButton DivisionButton;
    private JButton ACButton;
    private JButton DELButton;
    private JButton SumaButton;
    private JButton CeroButton;
    private JButton PuntoButton17;
    private JButton IgualButton;
    private JTextArea OperacionesText;
    private JTextArea RessultadoText;

    double numero1, numero2, result, resultado;
    String opcion;
    public Calculadora_basica() {
        CeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OperacionesText.setText(OperacionesText.getText()+CeroButton.getText());
            }
        });
        UnoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OperacionesText.setText(OperacionesText.getText()+UnoButton.getText());
            }
        });
        DosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OperacionesText.setText(OperacionesText.getText()+DosButton.getText());
            }
        });
        TresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OperacionesText.setText(OperacionesText.getText()+TresButton.getText());
            }
        });

        CuatroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OperacionesText.setText(OperacionesText.getText()+CuatroButton.getText());
            }
        });

        CincoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OperacionesText.setText(OperacionesText.getText()+CincoButton.getText());
            }
        });

        SeisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OperacionesText.setText(OperacionesText.getText()+SeisButton.getText());
            }
        });


        SieteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OperacionesText.setText(OperacionesText.getText()+SieteButton.getText());
            }
        });

        OchoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OperacionesText.setText(OperacionesText.getText()+OchoButton.getText());
            }
        });

        NueveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OperacionesText.setText(OperacionesText.getText()+NueveButton.getText());
            }
        });

        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OperacionesText.setText(" ");
                RessultadoText.setText(" ");
            }
        });

        PuntoButton17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!OperacionesText.getText().contains(".")) {
                    OperacionesText.setText(OperacionesText.getText() + PuntoButton17.getText());
                }
            }
        });
        SumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(OperacionesText.getText());
                RessultadoText.setText("");
                RessultadoText.setText(OperacionesText.getText()+" + ");
                opcion = "+";
                OperacionesText.setText("");
            }
        });
        RestaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(OperacionesText.getText());
                RessultadoText.setText("");
                RessultadoText.setText(RessultadoText.getText()+" - ");
                opcion = "-";
                OperacionesText.setText("");
            }
        });

        MultiplicacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(OperacionesText.getText());
                RessultadoText.setText("");
                RessultadoText.setText(RessultadoText.getText()+" x ");
                opcion = "x";
                OperacionesText.setText("");
            }
        });

        DivisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(OperacionesText.getText());
                RessultadoText.setText("");
                RessultadoText.setText(RessultadoText.getText()+" / ");
                opcion = "/";
                OperacionesText.setText("");
            }
        });
        IgualButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero2 = Double.parseDouble(OperacionesText.getText());

                if (opcion == "+") {
                    result = numero1 + numero2;
                    RessultadoText.setText(resultado + " + " + numero1+ " + " + numero2);
                    OperacionesText.setText(String.valueOf(result));
                }
                else if (opcion == "-") {
                    result = numero1 - numero2;
                    RessultadoText.setText(numero1+ " - " + numero2);
                    OperacionesText.setText(String.valueOf(result));
                }
                else if (opcion == "x") {
                    result = numero1 * numero2;
                    RessultadoText.setText(numero1+ " x " + numero2);
                    OperacionesText.setText(String.valueOf(result));
                }
                else if (opcion == "/") {
                    if (numero2 == 0){
                        RessultadoText.setText(" No se puede dividir entre cero ");
                    }
                    else {
                        result = numero1 / numero2;
                        RessultadoText.setText(numero1 + " / " + numero2);
                        OperacionesText.setText(String.valueOf(result));
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame1 = new JFrame("Poli Calcu");
        frame1.setContentPane(new Calculadora_basica().Panel_calculadora);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.pack();
        frame1.setVisible(true);
    }

}
