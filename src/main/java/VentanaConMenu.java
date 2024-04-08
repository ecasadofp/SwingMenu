import javax.swing.*;

public class VentanaConMenu {

    public VentanaConMenu(){

        String[] palabras = {"Casa","Coche", "Piedra", "Perro", "Gato","Casa","Coche", "Piedra"};
        JFrame marco = new JFrame("Ventana con menú");
        marco.setSize(300, 150);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollPane jScrollPane = new JScrollPane();
        marco.add(jScrollPane);

        JMenuBar menuBar = new JMenuBar();
        marco.setJMenuBar(menuBar);

        JMenu jMenuFile = new JMenu("File");
        JMenu jMenuEdit = new JMenu("Edit");

        menuBar.add(jMenuFile);
        menuBar.add(jMenuEdit);

        JMenu jMenuNew = new JMenu("New");
        JMenuItem jMenuItemOpen = new JMenuItem("Open");

        JMenuItem jMenuItemCut = new JMenuItem("Cut");

        JMenuItem jMenuItemProject = new JMenuItem("Project");

        jMenuFile.add(jMenuNew);
        jMenuFile.add(jMenuItemOpen);

        jMenuNew.add(jMenuItemProject);

        jMenuEdit.add(jMenuItemCut);

        jMenuItemProject.addActionListener(ae->JOptionPane.showInternalMessageDialog(marco.getContentPane(), "Has elegido project"));

        JList<String> jListPalabras = new JList<>(palabras);
        jListPalabras.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jScrollPane.setViewportView(jListPalabras);

        jMenuItemCut.addActionListener(ae->JOptionPane.showInternalMessageDialog(marco.getContentPane(),"Has elegido " + jListPalabras.getSelectedValue()));

        marco.setVisible(true);

    }

}
