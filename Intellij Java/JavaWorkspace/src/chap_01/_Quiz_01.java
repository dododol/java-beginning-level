package chap_01;

public class _Quiz_01 {
    public static void main(String[] args){
        // 버스 도착 정보를 출력하는 프로그램을 작성하시오. 각 정보는 적절한 자료형의 변수에 정의합니다.

        // 버스 번호는 "1234", "상암08"과 같은 형태
        int BusNo = 1234;
        System.out.println(BusNo + " 번 버스가");

        // 남은 시간은 분 단위(예: 3분, 5분)
        String Minute = "3분";
        System.out.println("약 " + Minute + " 후 도착 예정입니다.");

        // 남은 거리는 km 단위 (예: 1.5km, 0.8km)
        Double km = 1.5;
        System.out.println(km + " km 남았습니다.");

    }
}
