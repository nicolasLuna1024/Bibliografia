import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biografia extends JFrame{
    private JButton VerHobbis;
    private JPanel panel1;
    private JLabel txt;
    private JLabel titulo;
    private JLabel txt1;
    private JLabel txt2;
    private JLabel txt3;
    private JLabel txt4;
    private JLabel txt5;
    private JLabel txt6;
    private JLabel txt7;
    private JLabel txt8;
    private JLabel txt9;
    private JLabel txt10;
    private JLabel txt11;
    private JLabel txt12;

    public Biografia(){
        setContentPane(panel1);
        panel1.setLayout(null);

        titulo.setBounds(5,5,500,30);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setForeground(Color.red);

        ImageIcon imagen=new ImageIcon("C:\\BDD\\TareaS11\\Trabajo-Bibliografia\\src\\nicolas.jpeg");
        JLabel dise2=new JLabel();
        dise2.setOpaque(true);
        dise2.setBounds(5,50,200,210);
        dise2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(dise2.getWidth(),dise2.getHeight(), Image.SCALE_SMOOTH)));
        dise2.setBackground(Color.WHITE);
        panel1.add(dise2);
        txt.setBounds(210,120,270,30);
        txt.setText("Mi nombre es Nicolas Luna, nacido en Ecuador");
        txt.setHorizontalAlignment(SwingConstants.LEFT);

        txt1.setBounds(210,140,270,30);
        txt1.setText("en el año 2003 en el mes Septiembre dia 24");
        txt1.setHorizontalAlignment(SwingConstants.LEFT);

        txt2.setBounds(210,160,280,30);
        txt2.setText("Estudie en la escuela Eugenio Espejo");
        txt2.setHorizontalAlignment(SwingConstants.LEFT);

        txt6.setBounds(210,180,270,30);
        txt6.setText("En el cual me gradue y culmine mis estudios");
        txt6.setHorizontalAlignment(SwingConstants.LEFT);

        txt7.setBounds(210,200,270,30);
        txt7.setText("Actualemte estudio en la Universidad");
        txt7.setHorizontalAlignment(SwingConstants.LEFT);


        //DESDE AQUI
        txt8.setBounds(210,220,500,30);
        txt8.setText("EPN, escuela Politecnica Nacional");
        txt8.setHorizontalAlignment(SwingConstants.LEFT);

        txt9.setBounds(210,240,500,30);
        txt9.setText("en Desarrollo de Software");
        txt9.setHorizontalAlignment(SwingConstants.LEFT);



        VerHobbis.setBounds(150,350,200,30);

        VerHobbis.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Hobbies h1 = new Hobbies();
                h1.Iniciar();
                dispose();
            }
        });
    }
    public void Iniciar(){
        setVisible(true);
        setTitle("BIBLIOGRAFIA");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
