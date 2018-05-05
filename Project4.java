import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Project4 extends JFrame {
  public Project4() {
    setTitle("Class Dependency Graph");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new GridLayout(2,1));

    JPanel topPanel = new JPanel();
    topPanel.setLayout(new GridLayout(2,3));

    JLabel inputFileLabel = new JLabel("Input File Name:");
    JTextField inputFileText = new JTextField("");
    JButton buildDirectedGraph = new JButton("Build Directed Graph");

    JLabel classRecompileLabel = new JLabel("Class to Recompile:");
    JTextField classRecompileText = new JTextField("");
    JButton topologicalButton = new JButton("Topological Order");

    topPanel.setBorder(BorderFactory.createEtchedBorder());

    topPanel.add(inputFileLabel);
    topPanel.add(inputFileText);
    topPanel.add(buildDirectedGraph);
    topPanel.add(classRecompileLabel);
    topPanel.add(classRecompileText);
    topPanel.add(topologicalButton);
    add(topPanel);

    JPanel taPanel = new JPanel();
    taPanel.setLayout(new GridLayout(1,1));
    JTextArea ta = new JTextArea("");
    TitledBorder taTitle = BorderFactory.createTitledBorder("Recompilation Order");
    taPanel.setBorder(taTitle);
    taPanel.add(ta);
    add(taPanel);

    pack();
    setVisible(true);
    setSize(600,300);
  }

  public static void main(String[] args) {
    new Project4();
  }
}
