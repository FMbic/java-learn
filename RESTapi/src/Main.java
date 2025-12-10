/*
I want to make a script or whatever to automatically send a put request from a file
and if there is a certan word then add a lable to a put request
 */

public static void main(String[] args) throws Exception, error
{
    methods methods  = new methods();

    //List<dataGettingBack> getAll = methods.getAllMethod();
    //List<dataGettingBack> one = methods.getOne(10);

    //methods.putMethod(1);

    System.out.println("Put \n"+methods.putMethod(1));
    System.out.println("Get one \n"+methods.getOne(1));
    System.out.println("Delete \n"+methods.deleteMethod(3));
}

