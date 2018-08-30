import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField txtUser;
    private JPasswordField txtPwd;
    private JButton btnSubmit;
    private JButton btnClear;
    private JPanel Mainpanel;

    public Login() {
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,txtUser.getText()+" "+ new String (txtPwd.getPassword()));
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUser.setText("");
                txtPwd.setText("");
            }
        });
    }

    public JPanel getMainpanel() {
        return Mainpanel;
    }
}
