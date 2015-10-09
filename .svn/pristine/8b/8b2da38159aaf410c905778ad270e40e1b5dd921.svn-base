package team14.model;


import java.awt.EventQueue;

import team14.view.GUI;

/**
 * Starts The Tool and Menu Bar Example.
 * @author kjudoy
 * @version 11/16
 */
public final class Runner {
  
  /**
   * Private constructor to inhibit instantiation.
   */
    private Runner() {
        throw new IllegalStateException();
    }

  /**
   * Start point for the program.
   * 
   * @param args command line arguments - ignored
   */
    public static void main(final String... aRgs) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUI gui = new GUI();
                gui.setSize(gui.getPreferredSize());
                gui.setVisible(true);
            }
        });
    }

}

