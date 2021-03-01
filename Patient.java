public class Patient {
    String id;
    String name;
    String subjects[];
    int hours;

    public Patient(String ID,String Name,String[] Subjects,int Hours)
    {
        id=ID;
        name=Name;
        subjects=Subjects;
        hours=Hours;
    }

    public String get_id ()
    {
        return id;
    }

    public String get_name()
    {
        return name;
    }

    public   String[] get_subjects()
    {
        return subjects;
    }

    public int get_hours()
    {
        return hours;
    }

    public void setId(String iD_)
    {
        id = iD_;
    }

    public void setSubjects( String[] sub )
    {
        subjects= sub;
    }

    public void setName(String _name)
    {
        name=_name;
    }
}