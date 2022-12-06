import java.util.ArrayList;

public class Main {
    /**
     * En el curso no he hecho muchos comentarios ya que son funcionalidades simples y descriptivas
     * Sin embargo en proyectos personales he hecho comentarios redundantes y faltan comentarios,
     * con el curso de comentarios aprendí a documentar mejor.
     * @see <a href="https://github.com/No-Country/c7-32-m-node-react">Proyecto con Node</a>
     */


    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList();
        System.out.println(getTextHolaMundo());

        System.out.println(createUser("Javier", users));
        System.out.println(createUser("Javier", users));
    }

  /**
  *Funciones limpias
  */

  public static String getTextHolaMundo(){
      return "Hola Mundo";
  }

    /**
     * @param name nombre del usuario que quiere crear
     * @param users vector de usuarios
     * @return true si el usuario se creó false si el usuario ya existe
     */

  public static boolean createUser(String name,ArrayList<String> users){

      for (int i = 0; i < users.size(); i++) {
          if(users.get(i) == name){
              return false;
          }
      }
        users.add(name);
      return true;
  }

}