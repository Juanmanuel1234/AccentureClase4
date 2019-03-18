package interfazgraficausuario;

public class Ventana extends javax.swing.JFrame {

    private Incrementador incrementador;
    
    public Ventana(Incrementador incrementador) {
        initComponents();
        this.incrementador = incrementador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIncrementar = new javax.swing.JButton();
        display = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIncrementar.setText("Incrementar");
        btnIncrementar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncrementarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display)
                    .addComponent(btnIncrementar))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(display)
                .addGap(32, 32, 32)
                .addComponent(btnIncrementar)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncrementarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncrementarActionPerformed
        int nuevoInt = incrementador.incrementar();        
        display.setText(String.valueOf(nuevoInt));
    }//GEN-LAST:event_btnIncrementarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIncrementar;
    private javax.swing.JLabel display;
    // End of variables declaration//GEN-END:variables
}
