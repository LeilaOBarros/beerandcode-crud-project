import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;

public class BeerAndCode extends javax.swing.JFrame {

    public BeerAndCode() {
        initComponents();
        //Conectar com o Banco quando inicializar
        Conectar();
        //Gerenciar ao iniciar
        CarregarProduto();
    }
    
    //Conexão com o Banco   
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    public void Conectar () {
        try {        
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/beerandcode","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BeerAndCode.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BeerAndCode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //função separa para gerenciar 
    public void CarregarProduto() {
        try {
            ps = conn.prepareStatement("SELECT IdCerveja FROM Cervejas");
            rs = ps.executeQuery();
            //remover item da lista
            txtId.removeAllItems();
            //adicionar item na lista
            while (rs.next()){
                txtId.addItem(rs.getString(1));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BeerAndCode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        lblNomeProduto = new javax.swing.JLabel();
        lblPrecoProduto = new javax.swing.JLabel();
        lblQtdProduto = new javax.swing.JLabel();
        lblIdProduto = new javax.swing.JLabel();
        txtId = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        p2 = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        p3 = new javax.swing.JPanel();
        btnNovoProd = new javax.swing.JButton();
        p4 = new javax.swing.JPanel();
        lblAdega = new javax.swing.JLabel();
        lblNomeAdega = new javax.swing.JLabel();
        lblLayout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(222, 222, 87));
        setResizable(false);

        p1.setBackground(new java.awt.Color(102, 102, 102));
        p1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos da Beer and Code", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(222, 222, 82))); // NOI18N

        lblNomeProduto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNomeProduto.setForeground(new java.awt.Color(222, 222, 87));
        lblNomeProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeProduto.setText("*Nome da Cerveja:");

        lblPrecoProduto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPrecoProduto.setForeground(new java.awt.Color(222, 222, 87));
        lblPrecoProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecoProduto.setText("*Preço:");

        lblQtdProduto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblQtdProduto.setForeground(new java.awt.Color(222, 222, 87));
        lblQtdProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQtdProduto.setText("*Quantidade:");

        lblIdProduto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblIdProduto.setForeground(new java.awt.Color(222, 222, 87));
        lblIdProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdProduto.setText("*ID Cervejas:");

        txtId.setBackground(new java.awt.Color(0, 0, 0));
        txtId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(222, 222, 87));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(222, 222, 87));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtNome.setBackground(new java.awt.Color(0, 0, 0));
        txtNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(222, 222, 87));
        txtNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtPreco.setBackground(new java.awt.Color(0, 0, 0));
        txtPreco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPreco.setForeground(new java.awt.Color(222, 222, 87));
        txtPreco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        txtQtd.setBackground(new java.awt.Color(0, 0, 0));
        txtQtd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtQtd.setForeground(new java.awt.Color(222, 222, 87));
        txtQtd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeProduto)
                    .addComponent(lblPrecoProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblQtdProduto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(txtPreco)
                    .addComponent(txtQtd))
                .addGap(63, 63, 63)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIdProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblQtdProduto))
                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(p1Layout.createSequentialGroup()
                            .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(25, 25, 25)
                            .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPrecoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(48, 48, 48))
                        .addGroup(p1Layout.createSequentialGroup()
                            .addComponent(lblIdProduto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscar)
                            .addGap(19, 19, 19))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        p2.setBackground(new java.awt.Color(102, 102, 102));
        p2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        btnAdicionar.setBackground(new java.awt.Color(0, 0, 0));
        btnAdicionar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(222, 222, 87));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(0, 0, 0));
        btnAtualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(222, 222, 87));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(0, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(222, 222, 87));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExcluir)
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdicionar)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        p3.setBackground(new java.awt.Color(102, 102, 102));
        p3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        btnNovoProd.setBackground(new java.awt.Color(0, 0, 0));
        btnNovoProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNovoProd.setForeground(new java.awt.Color(222, 222, 87));
        btnNovoProd.setText("Novo Produto");
        btnNovoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        p4.setBackground(new java.awt.Color(102, 102, 102));
        p4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAdega.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblAdega.setForeground(new java.awt.Color(222, 222, 82));
        lblAdega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdega.setText("Cervejaria");

        lblNomeAdega.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblNomeAdega.setForeground(new java.awt.Color(222, 222, 82));
        lblNomeAdega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeAdega.setText("Beer and Code");
        lblNomeAdega.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNomeAdega)
                .addGap(21, 21, 21))
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblAdega)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAdega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeAdega)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblLayout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundoicon.png"))); // NOI18N
        lblLayout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 222, 87), 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        try {
            String nomecerveja = txtNome.getText();
            String precocerveja = txtPreco.getText();
            String qtdcerveja = txtQtd.getText();
            
            ps = conn.prepareStatement("INSERT INTO Cervejas (NomeCerveja, PrecoCerveja, QtdCerveja) VALUES (?, ?, ?)");
            ps.setString(1, nomecerveja);
            ps.setString(2, precocerveja);
            ps.setString(3, qtdcerveja);
            int x = ps.executeUpdate();
            
            if (x==1) {
                JOptionPane.showMessageDialog(this, "CERVEJA ARTESANAL ADICIONADA");
                txtNome.setText("");
                txtPreco.setText("");
                txtQtd.setText("");
                //RequestFocus: requisitar que o componente seja escolhido
                txtNome.requestFocus();
                //Gerenciar
                CarregarProduto();
                           
            } else {
                JOptionPane.showMessageDialog(this, "FALHA AO ADICIONAR CERVEJA ARTESANAL");                               
            }
            
                   
        } catch (SQLException ex) {
            Logger.getLogger(BeerAndCode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        //Reutilizando código do botão Adicionar
        try {
            String nomecerveja = txtNome.getText();
            String precocerveja = txtPreco.getText();
            String qtdcerveja = txtQtd.getText();
            String idcerveja = txtId.getSelectedItem().toString();
            
            ps = conn.prepareStatement("UPDATE Cervejas SET NomeCerveja=?, PrecoCerveja=?, qtdCerveja=? WHERE idCerveja=?");
            ps.setString(1, nomecerveja);
            ps.setString(2, precocerveja);
            ps.setString(3, qtdcerveja);
            ps.setString(4, idcerveja);
            int x = ps.executeUpdate();
            
            if (x==1) {
                JOptionPane.showMessageDialog(null, "CERVEJA ARTESANAL ATUALIZADA.", "Atualizar", 1);  
                txtNome.setText("");
                txtPreco.setText("");
                txtQtd.setText("");
                //RequestFocus: requisitar que o componente seja escolhido
                txtNome.requestFocus();
                CarregarProduto();
                           
            } else {
                JOptionPane.showMessageDialog(this, "FALHA AO ATUALIZAR CERVEJA ARTESANAL");                                               
            }
            
                   
        } catch (SQLException ex) {
            Logger.getLogger(BeerAndCode.class.getName()).log(Level.SEVERE, null, ex);
        }
                       
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnNovoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProdActionPerformed
        txtNome.setText("");
        txtPreco.setText("");
        txtQtd.setText("");
        txtNome.requestFocus();
        
        Object[] opcoes = {"SIM", "NÃO"};
        JOptionPane.showOptionDialog(null, "DESEJA ADICIONAR UMA NOVA CERVEJA ARTESAL?", "Nova Cerveja Artesanal",
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);  
    }//GEN-LAST:event_btnNovoProdActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            String idcerveja = txtId.getSelectedItem().toString();
            
            ps = conn.prepareStatement("DELETE FROM Cervejas WHERE IdCerveja=?");
            ps.setString(1, idcerveja);
            int x = ps.executeUpdate();
            
            if (x==1) {
                JOptionPane.showMessageDialog(null, "CERVEJA ARTESAL EXCLUIDA.", "Excluir", 0);  
                txtNome.setText("");
                txtPreco.setText("");
                txtQtd.setText("");
                //RequestFocus: requisitar que o componente seja escolhido
                txtNome.requestFocus();
                CarregarProduto();    
                
            } else {
                JOptionPane.showMessageDialog(this, "FALHA AO EXCLUIR CERVEJA ARTESAL");                                               
            }            
                   
        } catch (SQLException ex) {
            Logger.getLogger(BeerAndCode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String idcerveja = txtId.getSelectedItem().toString();

        try {
            ps = conn.prepareStatement("Select * from Cervejas where IdCerveja=? ");
            ps.setString(1, idcerveja);
            rs = ps.executeQuery();

            if (rs.next()==true) {
                //2, 3, 4 é a posição da coluna no BD
                txtNome.setText(rs.getString(2));
                txtPreco.setText(rs.getString(3));
                txtQtd.setText(rs.getString(4));

            }

        } catch (SQLException ex) {
            Logger.getLogger(BeerAndCode.class.getName()).log(Level.SEVERE, null, ex);
        }       

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    /**
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BeerAndCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BeerAndCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BeerAndCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BeerAndCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BeerAndCode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovoProd;
    private javax.swing.JLabel lblAdega;
    private javax.swing.JLabel lblIdProduto;
    private javax.swing.JLabel lblLayout;
    private javax.swing.JLabel lblNomeAdega;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblPrecoProduto;
    private javax.swing.JLabel lblQtdProduto;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JComboBox<String> txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
