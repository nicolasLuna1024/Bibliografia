import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login2 extends  JFrame{
    private JButton segundaVerificacionButton;
    private JTextField user;
    private JTextField pass;
    private JPanel panel1;

    public Login2(){
        setVisible(true);
        setTitle("Verificacion: Datos quemados de una bdd");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel1);


        segundaVerificacionButton.setBackground(Color.WHITE);
        segundaVerificacionButton.setForeground(Color.red);

        segundaVerificacionButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    VerificarDb();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });


    }

    public void Iniciar(){
        setVisible(true);
        setTitle("VERIFICACION EN UNA BASE DE DATOS");
        panel1.setBackground(Color.LIGHT_GRAY);
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void VerificarDb() throws SQLException {
        Connection conecta=conexion();
        String usaurio=user.getText();
        String contra=pass.getText();
        String sql="select * from biografia where usuario=? and password=?";
        PreparedStatement pstmt =conecta.prepareStatement(sql);
        pstmt.setString(1,usaurio);
        pstmt.setString(2,contra);

        ResultSet rs=pstmt.executeQuery();

        if (rs.next()){
            JOptionPane.showMessageDialog(null,"Datos correctos");
            Biografia b1=new Biografia();
            b1.Iniciar();
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"Datos incorrectos");
            user.setText("");
            pass.setText("");
        }


        rs.close();
        pstmt.close();
        conecta.close();

    }

    public Connection conexion() throws SQLException {
        String url="jdbc:mysql://localhost:3306/bibliografia";
        String user="root";
        String password="123456";
        return DriverManager.getConnection(url,user,password);
    }

    // ProbarConexion
    public void probarConexion() {
        try (Connection conn = conexion()) {
            if (conn != null) {
                JOptionPane.showMessageDialog(null, "Conexión a la base de datos exitosa");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.getMessage());
        }
    }

}

