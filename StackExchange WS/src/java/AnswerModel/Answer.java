package AnswerModel;
import javax.xml.bind.*;
import javax.xml.bind.annotation.*;
@XmlRootElement(name="Answer")
public class Answer {
    @XmlElement(name="id", required=true)
    private int id;
    @XmlElement(name="id_question", required=true)
    private int idQuestion;
    @XmlElement(name="id_user", required=true)
    private int idUser;
    @XmlElement(name="content", required=true)
    private String content;
    @XmlElement(name="timestamp", required=true)
    private String timestamp;
    
    public Answer() {
        id = 0;
        idQuestion = 0;
        idUser = 0;
    }
    
    public Answer(int id, int qid, int uid, String content, String timestamp) {
        this.id = id;
        idQuestion = qid;
        idUser = uid;
        this.content = content;
        this.timestamp = timestamp;
    }
}