package Biblioteka;


import java.util.Date;

public class Reader {
    private int ReaderId;
    private String Name;
    private String LastName;
    private int LibCardId;
    private Date dateIssue;
    private Date dateReturn;
    private int status;


    public Reader
            (int readerId, String Name, String lastName,int libCardId, Date dateIssue, Date dateReturn,int status)
    {   this.ReaderId = ReaderId;
        this.Name = Name;
        this.LastName = LastName;
        this.LibCardId = LibCardId;
        this.dateIssue = dateIssue;
        this.dateReturn = dateReturn;
        this.status = status;
    }
    public int getRaderId(){return ReaderId;};
    public void setReaderId(int getReaderId){this.ReaderId = ReaderId;}

    public String getName(){return Name;}
    public void setName(String Name){this.Name = Name;}

    public String getLastName() {return LastName;}
    public void setLastName(String LastName){this.LastName = LastName;}

    public int getLibCardId() {return LibCardId;}
    public void setLibCardId(int LibCardId){this.LibCardId = LibCardId;}

    public Date getdateIssue() {return dateIssue;}
    public void setdateIssue(Date dateIssue){this.dateIssue = dateIssue;}

    public Date getdateReturn() {return dateReturn;}
    public void setdateReturn(Date dateReturn){this.dateReturn = dateReturn;}

    public int getstatus() {return status;}
    public void setstatus(int status){this.status = status;}




}
