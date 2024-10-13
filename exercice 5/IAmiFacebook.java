package exercice;

import java.util.List;

public interface IAmiFacebook extends exercice.IPersonne {
    String getPseudo();
    void setPseudo(String s);
    void envoyerMessage(String msg, List<String> dist);
}
