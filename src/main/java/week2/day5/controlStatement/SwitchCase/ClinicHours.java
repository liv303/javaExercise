package week2.day5.controlStatement.SwitchCase;

public class ClinicHours {
    public static void main(String[] args) {
        String day = "월";
        String time = "휴진";

        switch (day) {
            case "월", "화", "목", "금": time = "09:30 ~ 18:30"; break;
            case "수", "일": time = "09:30 ~ 13:00"; break;
            case "토":
                time = "휴진"; break;
        }
        System.out.printf("%s요일 진료 시간은 %s입니다.", day, time);
    }
}
