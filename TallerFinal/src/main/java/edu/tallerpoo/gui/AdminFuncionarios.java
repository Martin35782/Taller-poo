package edu.tallerpoo.gui;

import com.opencsv.exceptions.CsvValidationException;
import edu.tallerpoo.data.Utilidades;
import edu.tallerpoo.model.Funcionario;
import edu.tallerpoo.model.tipoEstCivil;
import edu.tallerpoo.model.tipoRol;
import edu.tallerpoo.model.AdminSistema;
import edu.tallerpoo.model.tipoSexo;
import edu.tallerpoo.data.LogicaAdminSistema;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * Esta clase que maneja la pantalla en la que se dan de alta los funcionarios
 */
public class AdminFuncionarios extends javax.swing.JFrame {

    private AdminSistema admin;
    private boolean asignar;
    /**
     * Creates new form AdminFuncionarios
     */
    public AdminFuncionarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnRegistro.setEnabled(false);
        matriculaTextField.enable(false);
        sectorComboBox.enable(false);
    }
    /**
     * Metodo que permite que el admin del sistema que se logueo persista a traves de las ventanas.
     * 
     * @param admin {@link  AdminSistema}-Admin del sistema que hizo login.
     * @param asignar {@link Boolean}
     */
    public void setData(AdminSistema admin, boolean asignar){
        this.admin = admin;
        this.asignar = asignar;
    }
    
    /**
     * 
     * Este metodo se encarga de controlar que un String no tenga caracteres numericos ni comas
     * 
     * @param txt{@link String}- Recive como parametro un String a controlar
     * 
     * @return {@link Boolean}- Retorna True o False dependiendo si es valido o no el String ingresado.
     */
    public boolean validarTxt(String txt){
        boolean res;
        if(txt.isEmpty() || !txt.matches("^[^0-9+,._]+$")) {
            res = false;
        }else{
            res = true;
    }
        return res;
    }
    
    /**
     * 
     * Este metodo se encarga de controlar que un String de numeros no tenga letras ni comas
     * 
     * @param num{@link String}- Recive como parametro un String a controlar
     * 
     * @return {@link Boolean}- Retorna True o False dependiendo si es valido o no el String ingresado.
     */
    public boolean validarNum(String num){
        boolean res;
        if(num.isEmpty() || !num.matches("^[^A-Za-z+,.-]+$")) {
            res = false;
        }else{
            res = true;
        }
        return res;
    }
    
    /**
     *  Este metodo valida si todos los parametros ingresados por teclado son validos
     *  en caso de serlos habilita el boton para registrar el funcionario
     *
     */
    public void validar(){
        boolean domicilioValido,emailValido,fechaValido,usuarioValido,passValido=false;
    
        //valida el campo Nombre
        boolean nombreValido = validarTxt(nombreTextField.getText());

        //valida el campo Apellido
        boolean apellidoValido = validarTxt(apellidoTextField.getText());
    
        //valida que el campo Domicilio no contenga comas
        if(domicilioTextField.getText().isEmpty() || domicilioTextField.getText().contains(",")  ) {
            domicilioValido = false;
        }else{
            domicilioValido = true;
        }
        
        //valida el campo Documento
        boolean documentoValido = validarNum(documentoTextField.getText());
    
        //valida el campo Celular
        boolean celularValido = validarNum(celularTextField.getText());
        
        
        //valida que el campo email no contenga comas y que pueda ser un email valido
        if(emailTextField.getText().isEmpty() || !emailTextField.getText().matches("^[A-Za-z0-9+,_.-]+@[A-Za-z0-9+,.-]+$")
                || emailTextField.getText().contains(",")) {
            emailValido = false;
        }else{
            emailValido = true;
        }
        
        //valida haya una fecha de nacimiento
        if(FechaNacimiento.equals("")) {
            fechaValido = false;
        }else{
            fechaValido = true;
        }
    
        
        //valida que el campo usuario no tenga comas
        if(usuarioTextField.getText().isEmpty() || usuarioTextField.getText().contains(",")  ){
            usuarioValido = false;
        }else{
            usuarioValido = true;
        }
        
        //valida que el campo contraseña no tenga comas
        if(passwordTextField.getText().isEmpty() || passwordTextField.getText().contains(",")  ) {
            passValido = false;
        }else{
            passValido = true;
        }
        
        // habilita el boton para registrar el funcionario si todos los datos son validos
        btnRegistro.setEnabled(nombreValido && apellidoValido && domicilioValido && documentoValido && 
                celularValido && emailValido&& fechaValido && usuarioValido && passValido );
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cerrarsesionbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        altaButton = new javax.swing.JButton();
        informacionAdminButton = new javax.swing.JButton();
        inicioButton = new javax.swing.JButton();
        bajaButton = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellidoTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        domicilioTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        documentoTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telefonofijoTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        celularTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        sexoComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        usuarioTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rolComboBox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        sectorComboBox = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        matriculaTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        estadocivilComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));

        jPanel2.setBackground(new java.awt.Color(100, 204, 197));

        jLabel1.setBackground(new java.awt.Color(100, 204, 197));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital Delicia Concepcion Masvernat");

        cerrarsesionbtn.setBackground(new java.awt.Color(5, 59, 80));
        cerrarsesionbtn.setForeground(new java.awt.Color(255, 255, 255));
        cerrarsesionbtn.setText("Cerrar Sesion");
        cerrarsesionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarsesionbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 590, Short.MAX_VALUE)
                .addComponent(cerrarsesionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cerrarsesionbtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(23, 107, 135));

        altaButton.setBackground(new java.awt.Color(5, 59, 80));
        altaButton.setForeground(new java.awt.Color(255, 255, 255));
        altaButton.setText("Alta de Funcionarios");

        informacionAdminButton.setBackground(new java.awt.Color(5, 59, 80));
        informacionAdminButton.setForeground(new java.awt.Color(255, 255, 255));
        informacionAdminButton.setText("Informacion Administrativa");
        informacionAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informacionAdminButtonActionPerformed(evt);
            }
        });

        inicioButton.setBackground(new java.awt.Color(5, 59, 80));
        inicioButton.setForeground(new java.awt.Color(255, 255, 255));
        inicioButton.setText("Inicio");
        inicioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioButtonActionPerformed(evt);
            }
        });

        bajaButton.setBackground(new java.awt.Color(5, 59, 80));
        bajaButton.setForeground(new java.awt.Color(255, 255, 255));
        bajaButton.setText("Baja de Funcionarios");
        bajaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(altaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(informacionAdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inicioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bajaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(inicioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(altaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bajaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(informacionAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(372, Short.MAX_VALUE))
        );

        btnRegistro.setBackground(new java.awt.Color(5, 59, 80));
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("Registrar Funcionario");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(23, 107, 135));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(23, 107, 135));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar Funcionarios");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(238, 238, 238));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        nombreTextField.setBackground(new java.awt.Color(238, 238, 238));
        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });
        nombreTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreTextFieldKeyReleased(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(238, 238, 238));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Apellido");

        apellidoTextField.setBackground(new java.awt.Color(238, 238, 238));
        apellidoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidoTextFieldKeyReleased(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(238, 238, 238));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Fecha de Nacimiento");

        FechaNacimiento.setBackground(new java.awt.Color(238, 238, 238));
        FechaNacimiento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FechaNacimiento.setMaxSelectableDate(new Date());
        FechaNacimiento.setMinSelectableDate(new java.util.Date(-2208969686000L));
        FechaNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FechaNacimientoKeyReleased(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(238, 238, 238));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Domicilio");

        domicilioTextField.setBackground(new java.awt.Color(238, 238, 238));
        domicilioTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                domicilioTextFieldKeyReleased(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(238, 238, 238));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Documento");

        documentoTextField.setBackground(new java.awt.Color(238, 238, 238));
        documentoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                documentoTextFieldKeyReleased(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(238, 238, 238));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Telefono Fijo");

        telefonofijoTextField.setBackground(new java.awt.Color(238, 238, 238));

        jLabel6.setBackground(new java.awt.Color(238, 238, 238));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Celular");

        celularTextField.setBackground(new java.awt.Color(238, 238, 238));
        celularTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                celularTextFieldKeyReleased(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(238, 238, 238));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Estado Civil");

        sexoComboBox.setBackground(new java.awt.Color(238, 238, 238));
        sexoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "X" }));

        jLabel7.setBackground(new java.awt.Color(238, 238, 238));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Correo Electronico");

        emailTextField.setBackground(new java.awt.Color(238, 238, 238));
        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyReleased(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(238, 238, 238));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Usuario");

        usuarioTextField.setBackground(new java.awt.Color(238, 238, 238));
        usuarioTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usuarioTextFieldKeyReleased(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(238, 238, 238));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Contraseña");

        passwordTextField.setBackground(new java.awt.Color(238, 238, 238));
        passwordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordTextFieldKeyReleased(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(238, 238, 238));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Rol");

        rolComboBox.setBackground(new java.awt.Color(238, 238, 238));
        rolComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin. de Sistema", "Medico/a", "Enfermero/a", "Administrativo/a", "Gestor/a" }));
        rolComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolComboBoxActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(238, 238, 238));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Sector");

        sectorComboBox.setBackground(new java.awt.Color(238, 238, 238));
        sectorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admision", "Cuidados Intensivos", "Laboratorios Clinicos", "Urgencias", "Farmacia", "Administracion", "Gestoria" }));
        sectorComboBox.setEnabled(false);

        btnModificar.setBackground(new java.awt.Color(5, 59, 80));
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar Funcionario");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(238, 238, 238));
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("(Solo completar los campos a modificar)");

        jLabel17.setBackground(new java.awt.Color(238, 238, 238));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Matricula (Medico)");

        matriculaTextField.setBackground(new java.awt.Color(238, 238, 238));

        jLabel18.setBackground(new java.awt.Color(238, 238, 238));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Sexo");

        estadocivilComboBox.setBackground(new java.awt.Color(238, 238, 238));
        estadocivilComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Divorciado", "Viudo" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombreTextField)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(apellidoTextField)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(domicilioTextField)
                                .addComponent(documentoTextField)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telefonofijoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnModificar)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(celularTextField)
                                        .addComponent(emailTextField)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(rolComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwordTextField)
                                        .addComponent(usuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(estadocivilComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sectorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(matriculaTextField)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18))
                            .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sectorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(matriculaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(celularTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(estadocivilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(usuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rolComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(apellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(domicilioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(documentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telefonofijoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * al precionar el boton "cerrar sesion" Este metodo te cierra la pantalla actual y mustra la del Login
     * 
     * @param evt {@link java.awt.event.ActionEvent}
     */
    private void cerrarsesionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarsesionbtnActionPerformed
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        admin = null;
        asignar = false;
    }//GEN-LAST:event_cerrarsesionbtnActionPerformed

    /**
     * al precionar el boton "Registrar funcionario" este metodo genera un funcionario con todos sus parametros cargados y lo envia para confirmacion
     * 
     * @param evt {@link java.awt.event.ActionEvent}
     */
    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        LogicaAdminSistema logicaAdmin = new LogicaAdminSistema();
        
        String documento=documentoTextField.getText();
        String usuario=usuarioTextField.getText();
        try {
            //Si el dni ingresado esta repetido lanza una exepcion.
            if(logicaAdmin.existeFuncionarioDni(Integer.parseInt(documento))){
                throw new Exception ("El dni ingresado ya existe");       
            }
            System.out.println(usuario);
            //Si el usuario ingresado ya existe lanza una exepcion.
            if(logicaAdmin.existeFuncionarioUsuario(usuario)){
                throw new Exception ("El Usuario ya existe");  
            }
            
            Funcionario funcionario=new Funcionario();

        
            String nombre=nombreTextField.getText();
            funcionario.setNombre(nombre);
        
            String apellido=apellidoTextField.getText();
            funcionario.setApellido(apellido);
        
            Date fechaNacimiento = FechaNacimiento.getDate();
            Utilidades.convertDate(fechaNacimiento);
            funcionario.setFechaNac(fechaNacimiento);
        
            String domicilio=domicilioTextField.getText();
            funcionario.setDomicilio(domicilio);
                
       
            funcionario.setDocumento(Integer.parseInt(documento));
        
            String telFijo=telefonofijoTextField.getText();
            funcionario.setTelFijo(telFijo);
        
            String celular=celularTextField.getText();
            funcionario.setCelular(celular);
        
            String estadoCivil = (String) estadocivilComboBox.getSelectedItem();
            switch (estadoCivil){
                case "Casado":
                    funcionario.setEstadoCivil(tipoEstCivil.Casado);
                    break;
                case "Divorciado":
                    funcionario.setEstadoCivil(tipoEstCivil.Divorciado);
                    break;
                case "Soltero":
                    funcionario.setEstadoCivil(tipoEstCivil.Soltero);
                    break;
                case "Viudo":
                    funcionario.setEstadoCivil(tipoEstCivil.Viudo);
                }

        
            String email=emailTextField.getText();
            funcionario.setEmail(email);


            
            funcionario.setUsuario(usuario);

            String pass=passwordTextField.getText();
            funcionario.setContrasena(pass);

            String rol=(String)rolComboBox.getSelectedItem();
                switch (rol){
                case "Admin. de Sistema":
                    funcionario.setRol(tipoRol.AdminAsignador);
                    break;
                case "Gestor/a":
                    funcionario.setRol(tipoRol.Administrador);
                    break;
                case "Medico/a":
                    funcionario.setRol(tipoRol.Medico);
                    break;
                case "Enfermero/a":
                    funcionario.setRol(tipoRol.Enfermeria);
                    break;
                case "Administrativo/a":
                    funcionario.setRol(tipoRol.Administrativo);
                    break;

                }
            String sexo=(String)sexoComboBox.getSelectedItem();
                switch (sexo){
                case "Masculino":
                    funcionario.setSexo(tipoSexo.Masculino);
                    break;
                case "Femenino":
                    funcionario.setSexo(tipoSexo.Femenino);
                    break;
                case "X":
                    funcionario.setSexo(tipoSexo.X);
                    break;

                }

            ConfirmacionRegistro confir = new ConfirmacionRegistro();
            confir.setFuncionario(funcionario);
            confir.setVisible(true);
            confir.setLocationRelativeTo(null);
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(AdminFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error: "+e.getMessage(), "ERROR INGRESO", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnRegistroActionPerformed

    /**
     * Este metodo cierra la pantalla actual y mustra la principal del Administrador
     * 
     * @param evt {@link java.awt.event.ActionEvent}
     */
    private void inicioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioButtonActionPerformed
        this.dispose();
        Administrador admin1 = new Administrador();
        admin1.setData(admin, asignar);
        admin1.setVisible(true);
        admin1.setLocationRelativeTo(null);
    }//GEN-LAST:event_inicioButtonActionPerformed

    /**
     * al precionar el boton "inicio" este metodo cierra la pantalla actual y muestra en la que se da de baja un funcionario
     * 
     * @param evt {@link java.awt.event.ActionEvent}
     */
    private void bajaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaButtonActionPerformed
        this.dispose();
        AdminEliminarFuncionario deleteFuncionario = new AdminEliminarFuncionario();
        deleteFuncionario.setData(admin, asignar);
        deleteFuncionario.setVisible(true);
        deleteFuncionario.setLocationRelativeTo(null);
    }//GEN-LAST:event_bajaButtonActionPerformed

    /**
     * Este metodo llama al metodo validar() cuando se hace un cambio en el campo Nombre
     *
     * @param evt {@link java.awt.event.ActionEvent}
     */
    private void nombreTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTextFieldKeyReleased
        validar();
    }//GEN-LAST:event_nombreTextFieldKeyReleased

    /**
     * Este metodo llama al metodo validar() cuando se hace un cambio en el campo Apellido
     * 
     * @param evt {@link java.awt.event.ActionEvent}
     */
    private void apellidoTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoTextFieldKeyReleased
        validar();
    }//GEN-LAST:event_apellidoTextFieldKeyReleased

    /**
     * Este metodo llama al metodo validar() cuando se hace un cambio en el campo Fecha de nacimiento
     * @param evt {@link java.awt.event.ActionEvent}
     */
    private void FechaNacimientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaNacimientoKeyReleased
        validar();
    }//GEN-LAST:event_FechaNacimientoKeyReleased

    
    /**
     * Este metodo llama al metodo validar() cuando se hace un cambio en el campo Domicilio
     * @param evt {@link java.awt.event.ActionEvent}
     */
    private void domicilioTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_domicilioTextFieldKeyReleased
        validar();
    }//GEN-LAST:event_domicilioTextFieldKeyReleased

    /**
     * Este metodo llama al metodo validar() cuando se hace un cambio en el campo Documento
     * @param evt {@link java.awt.event.ActionEvent}
     */
    private void documentoTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documentoTextFieldKeyReleased
        validar();
    }//GEN-LAST:event_documentoTextFieldKeyReleased

    /**
     * Este metodo llama al metodo validar() cuando se hace un cambio en el campo Celular
     * @param evt {@link java.awt.event.ActionEvent}
     */
    private void celularTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celularTextFieldKeyReleased
        validar();
    }//GEN-LAST:event_celularTextFieldKeyReleased

    /**
     * Este metodo llama al metodo validar() cuando se hace un cambio en el campo Email 
     * @param evt {@link java.awt.event.ActionEvent}
     */
    private void emailTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyReleased
        validar();
    }//GEN-LAST:event_emailTextFieldKeyReleased

    /**
     * Este metodo llama al metodo validar() cuando se hace un cambio en el campo Contraseña
     * @param evt {@link java.awt.event.ActionEvent}
     */
    private void passwordTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextFieldKeyReleased
        validar();
    }//GEN-LAST:event_passwordTextFieldKeyReleased

    
    /**
     * Este metodo cierra la pantalla actual y muestra la que da Informacion Administrativa
     * @param evt {@link java.awt.event.ActionEvent}
     */
    private void informacionAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informacionAdminButtonActionPerformed
        this.dispose();
        AdminInformacion ad = new AdminInformacion();
        ad.setData(admin, asignar);
        ad.setVisible(true);
        ad.setLocationRelativeTo(null);
    }//GEN-LAST:event_informacionAdminButtonActionPerformed

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void rolComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolComboBoxActionPerformed
        switch(rolComboBox.getSelectedIndex()){
            case 1 -> {
                matriculaTextField.enable(true);
                sectorComboBox.enable(false);
            }
            case 3 -> {
                sectorComboBox.enable(true);
                matriculaTextField.enable(false);
            }
            default -> {
                sectorComboBox.enable(false);
                matriculaTextField.enable(false);
            }
        }
    }//GEN-LAST:event_rolComboBoxActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void matriculaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaTextFieldActionPerformed

    }//GEN-LAST:event_matriculaTextFieldActionPerformed

    private void usuarioTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioTextFieldKeyReleased
         validar();
    }//GEN-LAST:event_usuarioTextFieldKeyReleased

    /**
     * main de la pantalla
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.JButton altaButton;
    private javax.swing.JTextField apellidoTextField;
    private javax.swing.JButton bajaButton;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JTextField celularTextField;
    private javax.swing.JButton cerrarsesionbtn;
    private javax.swing.JTextField documentoTextField;
    private javax.swing.JTextField domicilioTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JComboBox<String> estadocivilComboBox;
    private javax.swing.JButton informacionAdminButton;
    private javax.swing.JButton inicioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField matriculaTextField;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JComboBox<String> rolComboBox;
    private javax.swing.JComboBox<String> sectorComboBox;
    private javax.swing.JComboBox<String> sexoComboBox;
    private javax.swing.JTextField telefonofijoTextField;
    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables
}
