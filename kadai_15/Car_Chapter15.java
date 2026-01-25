package kadai_15;

public class Car_Chapter15 {
	  // フィールド
    private int gear = 1;   // ギア（初期値：1）
    private int speed = 10; // 速度（初期値：10km）

    // ギアチェンジして速度を変更するメソッド
    public void changeGear(int afterGear) {
        gear = afterGear;

        switch (gear) {
            case 1:
                speed = 10;
                break;
            case 2:
                speed = 20;
                break;
            case 3:
                speed = 30;
                break;
            case 4:
                speed = 40;
                break;
            case 5:
                speed = 50;
                break;
            default:
                speed = 10;
                break;
        }

        System.out.println("ギア1から" + gear + "に切り替えました");
    }

    // 走行して速度を表示するメソッド
    public void run() {
        System.out.println("速度は時速" + speed + "kmです");
    }
}

