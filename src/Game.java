
import javax.swing.JFrame;


public class Game extends JFrame{
    private String titulo;
    private String description;
    private String author;
    
    /*public Game() throws Exception{
        initUI();
    }*/

    public Game(String titulo, String description, String author)throws Exception {
        initUI();
        this.titulo = titulo.toString();
        this.description = description;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return titulo;
    }

    public String getDescription() {
        return description;
    }
    
    
    
    
    private void initUI() throws Exception{
        add(new Maze());
        setResizable(false);
        pack();
        
        setTitle(this.titulo);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /*public static void main(String[] args){
        try{
            JFrame ex = new Game("a", "b", "c");
            ex.setVisible(true);
        }catch (Exception ex1){
            ex1.printStackTrace();
        }
    }*/
    
    
        
        
    
}

