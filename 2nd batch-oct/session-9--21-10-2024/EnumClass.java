enum Status{
    IN_PROGRESS,COMPLETED,FAILED
}

public class EnumClass{
    public static void main(String[] args) {
        Status progress_status[] = Status.values();
        System.out.println(progress_status[1]);
    }
}