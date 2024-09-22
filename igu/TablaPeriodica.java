package igu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TablaPeriodica extends JFrame {
        
            public TablaPeriodica() {
                // Configura el JFrame
                setTitle("Tabla Periódica");
                setSize(1000, 600); // Tamaño del JFrame
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLayout(new BorderLayout());
        
                // Panel para la parte superior con 3 paneles
                JPanel panelSuperior = new JPanel(new GridLayout(2, 3));
        
                // Crear y agregar los tres paneles
                for (int i = 0; i < 3; i++) {
                    JPanel panel = new JPanel();
                    panel.setPreferredSize(new Dimension(200, 100));
                    panel.setBackground(new Color(200 + i * 20, 100 + i * 20, 150));
                    panel.add(new JLabel("Panel " + (i + 1)));
                    panelSuperior.add(panel);
                }
        
                // Agrega el panel superior al JFrame
                add(panelSuperior, BorderLayout.NORTH);
        
                // Crea un JPanel con GridBagLayout para la tabla
                JPanel panelTabla = new JPanel(new GridBagLayout());
                panelTabla.setBackground(Color.WHITE);
        
                // Define los elementos de la tabla periódica
                String[][] elementos = {
                    {"H", "1", "1.008"}, {"He", "", ""},//FILA 1
                    {"Li", "3", "6.94"}, {"Be", "", ""}, {"B", "5", "10.81"}, {"C", "", ""}, {"N", "", ""}, {"O", "8", "15.999"}, {"F", "", ""}, {"Ne", "", ""},//FILA 2
                    {"Na", "11", "22.990"}, {"Mg", "12", "24.305"}, {"Al", "", ""}, {"Si", "", ""}, {"P", "15", "30.974"}, {"S", "", ""}, {"Cl", "17", "35.45"}, {"Ar", "", ""},//FILA 3
                    //FILA 4
                    {"K", "", ""}, {"Ca", "20", "40.078"}, {"Sc", "", ""}, {"Ti", "", ""}, {"V", "", ""}, {"Cr", "", ""}, {"Mn", "", ""}, {"Fe", "26", "55.845"}, {"Co", "", ""}, 
                    {"Ni", "", ""},{"Cu", "", ""}, {"Zn", "", ""}, {"Ga", "", ""}, {"Ge", "", ""}, {"As", "", ""}, {"Se", "", ""}, {"Br", "35", "79.904"}, {"Kr", "", ""},
                    //FILA 5
                    {"Rb", "", ""}, {"Sr", "", ""}, {"Y", "", ""}, {"Zr", "", ""}, {"Nb", "", ""}, {"Mo", "", ""}, {"Tc", "", ""}, {"Ru", "", ""}, {"Rh", "", ""}, 
                    {"Pd", "", ""},{"Ag", "", ""}, {"Cd", "", ""}, {"In", "", ""}, {"Sn", "", ""}, {"Sb", "", ""}, {"Te", "", ""}, {"I", "53", "126.90"}, {"Xe", "", ""},
                    //FILA 6
                    {"Cs", "", ""}, {"Ba", "", ""}, {"La", "", ""}, {"Hf", "", ""}, {"Ta", "", ""}, {"W", "", ""},{"Re", "", ""}, {"Os", "", ""}, {"Ir", "", ""}, 
                    {"Pt", "", ""}, {"Au", "79", "196.97"}, {"Hg", "", ""}, {"Tl", "", ""}, {"Pb", "", ""},{"Bi", "", ""}, {"Po", "", ""}, {"At", "", ""}, {"Rn", "", ""}, 
                    //FILA 7
                    {"Fr", "", ""}, {"Ra", "", ""},{"Lr", "", ""}, {"Rf", "", ""}, {"Db", "", ""}, {"Sg", "", ""}, {"Bh", "", ""}, {"Hs", "", ""}, {"Mt", "", ""}, {"Ds", "", ""}, {"Rg", "", ""}, {"Cn", "", ""},//FILA 7
                    {"Nh", "", ""}, {"Fl", "", ""}, {"Mc", "", ""}, {"Lv", "", ""}, {"Ts", "", ""}, {"Og", "", ""}
                };
        
                // Posiciones de los elementos en la tabla periódica
                int[][] posiciones = {
                    {0, 0}, {0, 17},  // Fila 1
                    {1, 0}, {1, 1}, {1, 12}, {1, 13}, {1, 14}, {1, 15}, {1, 16}, {1, 17},  // Fila 2
                    {2, 0}, {2, 1}, {2, 12}, {2, 13}, {2, 14}, {2, 15}, {2, 16}, {2, 17}, // Fila 3
                    {3, 0}, {3, 1}, {3, 2}, {3, 3}, {3, 4}, {3, 5}, {3, 6}, {3, 7}, {3, 8}, {3, 9}, {3, 10}, {3, 11}, {3, 12}, {3, 13}, {3, 14}, {3, 15}, {3, 16}, {3, 17},// Fila 4 
                    {4, 0}, {4, 1}, {4, 2}, {4, 3}, {4, 4}, {4, 5}, {4, 6}, {4, 7}, {4, 8}, {4, 9}, {4, 10}, {4, 11}, {4, 12}, {4, 13}, {4, 14}, {4, 15}, {4,16}, {4, 17}, // Fila 5
                    {5, 0}, {5, 1}, {5, 2}, {5, 3}, {5, 4}, {5, 5}, {5, 6}, {5, 7}, {5, 8},{5, 9}, {5, 10}, {5, 11}, {5, 12}, {5, 13}, {5, 14}, {5, 15}, {5, 16}, {5, 17}, // Fila 6
                    {6, 0}, {6, 1}, {6, 2}, {6, 3}, {6, 4}, {6, 5}, {6, 6}, {6, 7}, {6, 8},{6, 9}, {6, 10}, {6, 11}, {6, 12}, {6, 13}, {6, 14}, {6, 15}, {6, 16}, {6, 17}, // Fila 7
                    {7, 0}, {7, 1}, {7, 2}, {7, 3}, {7, 4}, {7, 5}, {7, 6}, {7, 7}, {7, 8}, {7, 9}, {7, 10}, {7, 11}, {7, 12}, {7, 13}, {7, 14}, {7, 15}, {7, 16}, {7, 17}, // Fila 8
                };  
        
        
                // Colores para los botones
                Color[] colores = {
                    Color.YELLOW, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY,
                    Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY,
                    Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.RED, Color.GREEN, Color.BLUE,
                    Color.CYAN, Color.MAGENTA, Color.ORANGE
                };        
                int colorIndex = 0;
               

        for (int i = 0; i < elementos.length; i++) {
               JButton boton = new JButton("<html><center>" + elementos[i][0] + "<br/>" + elementos[i][1] + "<br/>" + elementos[i][2] + "</center></html>");
               //les doy colores a los elementos que se quiere
               // Asignar colores personalizados
               switch (elementos[i][0]) {
                   case "H":
                       boton.setBackground(Color.ORANGE);
                       break;
                   case "O":
                       boton.setBackground(Color.ORANGE);
                       break;
                   case "Br":
                       boton.setBackground(Color.ORANGE);
                       break;
                   case "Li":
                       boton.setBackground(Color.BLUE);
                       break;
                   case "Na":
                       boton.setBackground(Color.BLUE);
                       break;
                   case "Mg":
                       boton.setBackground(Color.BLUE);
                       break;
                   case "Ca":
                       boton.setBackground(Color.BLUE);
                       break;
                   case "Fe":
                       boton.setBackground(Color.BLUE);
                       break;
                   case "Au":
                       boton.setBackground(Color.BLUE);
                       break;
                   case "He":
                       boton.setBackground(Color.DARK_GRAY);
                       break;
                   case "B":
                       boton.setBackground(Color.GREEN);
                       break;
                   default:
                    boton.setBackground(Color.WHITE);
            }
               
            boton.setPreferredSize(new Dimension(70, 70)); // Tamaño de cada botón
            // Define la posición del elemento en el GridBagLayout
            GridBagConstraints gbc = new GridBagConstraints();
                
            gbc.gridx = posiciones[i][1];//columna
            gbc.gridy = posiciones[i][0];//fila

            gbc.insets = new Insets(1,1, 1, 1); // Espaciado entre botones
            panelTabla.add(boton, gbc);
        }
        
        // Agrega el panel de la tabla al JFrame
        add(panelTabla, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TablaPeriodica tabla = new TablaPeriodica();
            tabla.setVisible(true);
        });
    }

}