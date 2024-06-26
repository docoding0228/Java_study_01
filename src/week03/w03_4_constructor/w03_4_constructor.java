package week03.w03_4_constructor;

public class w03_4_constructor {

    static final String COMPANY = "GENESIS"; // 자동차 회사 : GENESIS
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear = 'P'; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태

    public w03_4_constructor(String modelName) {
        model = modelName;
    }

    public w03_4_constructor(String modelName, String colorName) {
        model = modelName;
        color = colorName;
    }

    public w03_4_constructor(String modelName, String colorName, double priceValue) {
        model = modelName;
        color = colorName;
        price = priceValue;
    }

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵빵");
    }


}
