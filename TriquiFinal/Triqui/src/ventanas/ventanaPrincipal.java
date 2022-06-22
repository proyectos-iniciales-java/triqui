
package ventanas;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Usuario-PC
 */
public class ventanaPrincipal extends javax.swing.JFrame {
    
    //creacion de una matriz de tipo boleano de 3*3 ya que son las medidas del tablero
    private boolean casilla [][]= new boolean[3][3];
    private String turno = "usuario1";
    private int matriz [][]= new int [3][3];
    private String usuario1, usuario2;
    private int vecesGano1=0,vecesGano2=0,vecesEmpate=0;
    
    
    public ventanaPrincipal(String usuario1, String usuario2) {
        this.usuario1 =usuario1;
        this.usuario2 =usuario2;
        
        initComponents();
        //tamaño
        setSize(600, 600);
        //centro de mi ventana
        setLocationRelativeTo(null);
        llenarCasillas();
        llenarMatriz();
        
    }
    //inicialmente todas mis casillas van a ser igual a true hasta
    //que le de click a uno de los botones 
    //este metodo llena la matriz dependiendo si es x o circulo
    private void llenarCasillas(){
       for (int i = 0 ; i<3; i++){
          for(int j=0; j<3; j++){
           casilla [i][j]=true;  
          } 
       } 
}   //llena el numero de posiciones
    private void llenarMatriz(){
        for (int i = 0 ; i<3; i++){
          for(int j=0; j<3; j++){
           matriz [i][j]=0;  
          } 
       } 
    }
    
    //Metodo para dibujar la x 
    private void dibujarX(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/x.png")));   
    }
    //metodo para dibujar la O
    private void dibujarO(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/o.png")));   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        botonArribaIzquierda = new javax.swing.JButton();
        botonArriba = new javax.swing.JButton();
        botonArribaDerecha = new javax.swing.JButton();
        botonIzquierda = new javax.swing.JButton();
        botonCentro = new javax.swing.JButton();
        botonDerecha = new javax.swing.JButton();
        botonAbajoIzquierda = new javax.swing.JButton();
        BotonAbajo = new javax.swing.JButton();
        BotonAbajoDerecha = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        MenuJuego = new javax.swing.JMenu();
        comenzarDeNuevo = new javax.swing.JMenuItem();
        mostrarResultados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tres en Línea");

        panel.setLayout(new java.awt.GridLayout(3, 3));

        botonArribaIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonArribaIzquierda);

        botonArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaActionPerformed(evt);
            }
        });
        panel.add(botonArriba);

        botonArribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaDerechaActionPerformed(evt);
            }
        });
        panel.add(botonArribaDerecha);

        botonIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonIzquierda);

        botonCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentroActionPerformed(evt);
            }
        });
        panel.add(botonCentro);

        botonDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDerechaActionPerformed(evt);
            }
        });
        panel.add(botonDerecha);

        botonAbajoIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonAbajoIzquierda);

        BotonAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbajoActionPerformed(evt);
            }
        });
        panel.add(BotonAbajo);

        BotonAbajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbajoDerechaActionPerformed(evt);
            }
        });
        panel.add(BotonAbajoDerecha);

        MenuJuego.setText("Juego");
        MenuJuego.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        comenzarDeNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzarDeNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-volver-30.png"))); // NOI18N
        comenzarDeNuevo.setText("Comenzar de nuevo");
        comenzarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarDeNuevoActionPerformed(evt);
            }
        });
        MenuJuego.add(comenzarDeNuevo);

        mostrarResultados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mostrarResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-tabla-de-posiciones-30.png"))); // NOI18N
        mostrarResultados.setText("Mostrar tabla de resultados");
        mostrarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarResultadosActionPerformed(evt);
            }
        });
        MenuJuego.add(mostrarResultados);
        MenuJuego.add(jSeparator1);

        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-cerrar-ventana-30.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        MenuJuego.add(salir);

        barraMenu.add(MenuJuego);

        MenuAyuda.setText("Ayuda");
        MenuAyuda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        MenuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuAyudaMouseClicked(evt);
            }
        });
        barraMenu.add(MenuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        //para salir del programa
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void botonArribaIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaIzquierdaActionPerformed
        if (casilla[0][0]==true){//es true porque se esta verificando si aun no se ha dado click sobre el boton
           if (turno == "usuario1"){//verificamos el turno
              //si es turno de usuario 1 dibujamos una x
               dibujarX(botonArribaIzquierda);
               //sera uno cuando sea turno del ususario 1
               //asi se pueden saber las combinaciones que tiene el usuario 1
               matriz [0][0]=1;
              //pasa al ususuario 2
               turno = "usuario2";
           } 
           else{//turno usuario 2
               //Pero si es turno del usuario 2 dibujamos una o
               dibujarO(botonArribaIzquierda);
               //sera dos cuando sea turno del ususario 2
               //asi se pueden saber las combinaciones que tiene el usuario 2
               matriz [0][0]=2;
               turno="usuario1";
           }
           
           casilla [0][0]=false;
           comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaIzquierdaActionPerformed

    private void botonArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaActionPerformed
        if (casilla[0][1]==true){//es true porque se esta verificando si aun no se ha dado click sobre el boton
           if (turno == "usuario1"){//verificamos el turno
              //si es turno de usuario 1 dibujamos una x
               dibujarX(botonArriba);
                matriz [0][1]=1;
              //pasa al ususuario 2
               turno = "usuario2";
           } 
           else{//turno usuario 2
               //Pero si es turno del usuario 2 dibujamos una o
               dibujarO(botonArriba);
               matriz [0][1]=2;
               turno="usuario1";
           }
           
           casilla [0][1]=false;
           comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaActionPerformed

    private void botonArribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaDerechaActionPerformed
        if (casilla[0][2]==true){//es true porque se esta verificando si aun no se ha dado click sobre el boton
           if (turno == "usuario1"){//verificamos el turno
              //si es turno de usuario 1 dibujamos una x
               dibujarX(botonArribaDerecha);
               matriz [0][2]=1;
              //pasa al ususuario 2
               turno = "usuario2";
           } 
           else{//turno usuario 2
               //Pero si es turno del usuario 2 dibujamos una o
               dibujarO(botonArribaDerecha);
               matriz [0][2]=2;
               turno="usuario1";
           }
           
           casilla [0][2]=false;
           comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaDerechaActionPerformed

    private void botonIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIzquierdaActionPerformed
        if (casilla[1][0]==true){//es true porque se esta verificando si aun no se ha dado click sobre el boton
           if (turno == "usuario1"){//verificamos el turno
              //si es turno de usuario 1 dibujamos una x
               dibujarX(botonIzquierda);
               matriz [1][0]=1;
              //pasa al ususuario 2
               turno = "usuario2";
           } 
           else{//turno usuario 2
               //Pero si es turno del usuario 2 dibujamos una o
               dibujarO(botonIzquierda);
               matriz [1][0]=2;
               turno="usuario1";
           }
           
           casilla [1][0]=false;
           comprobarGanador();
        }
    }//GEN-LAST:event_botonIzquierdaActionPerformed

    private void botonCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentroActionPerformed
        if (casilla[1][1]==true){//es true porque se esta verificando si aun no se ha dado click sobre el boton
           if (turno == "usuario1"){//verificamos el turno
              //si es turno de usuario 1 dibujamos una x
               dibujarX(botonCentro);
               matriz [1][1]=1;
              //pasa al ususuario 2
               turno = "usuario2";
           } 
           else{//turno usuario 2
               //Pero si es turno del usuario 2 dibujamos una o
               dibujarO(botonCentro);
               matriz [1][1]=2;
               turno="usuario1";
           }
           
           casilla [1][1]=false;
           comprobarGanador();
        }
    }//GEN-LAST:event_botonCentroActionPerformed

    private void botonDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDerechaActionPerformed
        if (casilla[1][2]==true){//es true porque se esta verificando si aun no se ha dado click sobre el boton
           if (turno == "usuario1"){//verificamos el turno
              //si es turno de usuario 1 dibujamos una x
               dibujarX(botonDerecha);
                matriz [1][2]=1;
              //pasa al ususuario 2
               turno = "usuario2";
           } 
           else{//turno usuario 2
               //Pero si es turno del usuario 2 dibujamos una o
               dibujarO(botonDerecha);
               matriz [1][2]=2;
               turno="usuario1";
           }
           
           casilla [1][2]=false;
           comprobarGanador();
        }
    }//GEN-LAST:event_botonDerechaActionPerformed

    private void botonAbajoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoIzquierdaActionPerformed
        if (casilla[2][0]==true){//es true porque se esta verificando si aun no se ha dado click sobre el boton
           if (turno == "usuario1"){//verificamos el turno
              //si es turno de usuario 1 dibujamos una x
               dibujarX(botonAbajoIzquierda);
               matriz [2][0]=1;
              //pasa al ususuario 2
               turno = "usuario2";
           } 
           else{//turno usuario 2
               //Pero si es turno del usuario 2 dibujamos una o
               dibujarO(botonAbajoIzquierda);
               matriz [2][0]=2;
               turno="usuario1";
           }
           //para que no cambien las imagenes al volver a dar click
           casilla [2][0]=false;
           comprobarGanador();
        }
    }//GEN-LAST:event_botonAbajoIzquierdaActionPerformed

    private void BotonAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbajoActionPerformed
       if (casilla[2][1]==true){//es true porque se esta verificando si aun no se ha dado click sobre el boton
           if (turno == "usuario1"){//verificamos el turno
              //si es turno de usuario 1 dibujamos una x
               dibujarX(BotonAbajo);
               matriz [2][1]=1;
              //pasa al ususuario 2
               turno = "usuario2";
           } 
           else{//turno usuario 2
               //Pero si es turno del usuario 2 dibujamos una o
               dibujarO(BotonAbajo);
               matriz [2][1]=2;
               turno="usuario1";
           }
           
           casilla [2][1]=false;
           comprobarGanador();
        }
    }//GEN-LAST:event_BotonAbajoActionPerformed

    private void BotonAbajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbajoDerechaActionPerformed
        if (casilla[2][2]==true){//es true porque se esta verificando si aun no se ha dado click sobre el boton
           if (turno == "usuario1"){//verificamos el turno
              //si es turno de usuario 1 dibujamos una x
               dibujarX(BotonAbajoDerecha);
               matriz [2][2]=1;
              //pasa al ususuario 2
               turno = "usuario2";
           } 
           else{//turno usuario 2
               //Pero si es turno del usuario 2 dibujamos una o
               dibujarO(BotonAbajoDerecha);
               matriz [2][2]=2;
               turno="usuario1";
           }
           
           casilla [2][2]=false;
           comprobarGanador();
        }
    }//GEN-LAST:event_BotonAbajoDerechaActionPerformed

    private void mostrarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarResultadosActionPerformed
        ventanaMostrarResultados ventanaMR = new ventanaMostrarResultados(this, true, usuario1, usuario2, vecesGano1, vecesGano2, vecesEmpate);
        ventanaMR.setVisible(true);
    }//GEN-LAST:event_mostrarResultadosActionPerformed

    private void comenzarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarDeNuevoActionPerformed
        vecesGano1=0;vecesGano2=0;vecesEmpate=0; 
        reiniciarJuego();
    }//GEN-LAST:event_comenzarDeNuevoActionPerformed

    private void MenuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAyudaMouseClicked
        try {
            try {
                Desktop.getDesktop().browse(new URI("https://es.wikihow.com/jugar-al-triqui-(tres-en-raya)"));
            } catch (IOException ex) {
               // Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
          } catch (URISyntaxException ex) {
            //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuAyudaMouseClicked

      //este metodo se va a comprobar en cada uno de los botones en los que le de click
    private void comprobarGanador(){
       boolean ganador1=false;
       boolean ganador2=false;
       int casillasEmpate = 0;
       
       ganador1 = comprobar(1);
       ganador2 = comprobar(2);
        
        if (ganador1==true){
            vecesGano1++;
            ventanaGanador ventanaG = new ventanaGanador(this, true, usuario1);
            ventanaG.setVisible(true);
            
            reiniciarJuego();
        }
        else if(ganador2 == true){
            vecesGano2++;
            ventanaGanador ventanaG = new ventanaGanador(this, true, usuario2);
            ventanaG.setVisible(true);
            reiniciarJuego();
        }
        else{//si no ha ganado ninguno de los usuarios tal vez el tablero esta lleno, hay un empate
          for (int i = 0 ; i<3; i++){
            for(int j=0; j<3; j++){
                if (matriz [i][j]!=0){//si al recorrer la matriz hay un numero diferente de 0 puede haber un numero 1 o un numero 2
                //casillas empate es un contador que me cuenta el numero de casillas llenas 
                   casillasEmpate++;  
              }
          } 
        }
          //si casillas empate llega a 9 quiere decir que se lleno 
          if(casillasEmpate == 9){
              vecesEmpate++;
              ventanaEmpate ventanaE = new ventanaEmpate(this,true);
              ventanaE.setVisible(true);
              reiniciarJuego();
          }
          else{
             casillasEmpate = 0; 
          }
          
        /*for (int i = 0 ; i<3; i++){
          for(int j=0; j<3; j++){
              //imprime ya sea uno o dos dependiento el usuario y lo ubica en la matriz cada que le doy click
              System.out.print(matriz[i][j]+" ");
          } 
            System.out.println("");
       }
        System.out.println("");*/
        }
    }
    //solo hay dos posibles numeros 1 o 2 
    private boolean comprobar(int num){
        boolean ganador = false;
        //si la primera fila cada posicion es igual al numero ahi se determina cual es el ganador si uno o dos 
        if(matriz [0][0]== num && matriz[0][1]== num && matriz[0][2]== num){
        ganador = true;
        }
        else if(matriz [1][0]== num && matriz[1][1]== num && matriz[1][2]== num){
        ganador = true;
        }
        else if(matriz [2][0]== num && matriz[2][1]== num && matriz[2][2]== num){
        ganador = true;
        }
        else if(matriz [0][0]== num && matriz[1][0]== num && matriz[2][0]== num){
        ganador = true;
        }
        else if(matriz [0][1]== num && matriz[1][1]== num && matriz[2][1]== num){
        ganador = true;
        }
        else if(matriz [0][2]== num && matriz[1][2]== num && matriz[2][2]== num){
        ganador = true;
        }
        else if(matriz [0][0]== num && matriz[1][1]== num && matriz[2][2]== num){
        ganador = true;
        }
        else if(matriz [0][2]== num && matriz[1][1]== num && matriz[2][0]== num){
        ganador = true;
        }
        return ganador;
    }
    
        private void reiniciarJuego(){
            llenarCasillas();
            llenarMatriz();
            
            botonArribaIzquierda.setIcon(null);
            botonArriba.setIcon(null);
            botonArribaDerecha.setIcon(null);
            botonIzquierda.setIcon(null);
            botonCentro.setIcon(null);
            botonDerecha.setIcon(null);
            botonAbajoIzquierda.setIcon(null);
            BotonAbajo.setIcon(null);
            BotonAbajoDerecha.setIcon(null);
            
         //se va a preguntar al usuario quien va a jugar primero
         
         quienJuegaPrimero();
            
        }
        
        private void quienJuegaPrimero(){
          ventanaEscogerTurno ventanaET = new ventanaEscogerTurno(this, true, usuario1, usuario2);
          ventanaET.setVisible(true);
          turno = ventanaET.getTurno();
        }
            
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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAbajo;
    private javax.swing.JButton BotonAbajoDerecha;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenu MenuJuego;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botonAbajoIzquierda;
    private javax.swing.JButton botonArriba;
    private javax.swing.JButton botonArribaDerecha;
    private javax.swing.JButton botonArribaIzquierda;
    private javax.swing.JButton botonCentro;
    private javax.swing.JButton botonDerecha;
    private javax.swing.JButton botonIzquierda;
    private javax.swing.JMenuItem comenzarDeNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mostrarResultados;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
