public class Doctors_appointments {
    String type;
     String date;
     String time;

    public Doctors_appointments(String type_,String date_,String time_)
    {
        type=type_;
        date=date_;
        time=time_;
    }
    public String get_type ()
    {
        return type;
    }

    public String get_date()
    {
        return date;
    }

    public String get_time()
    {
        return time;
    }

}
