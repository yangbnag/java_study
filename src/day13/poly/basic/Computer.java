package day13.poly.basic;

class Monitor{}

class LGMonitor extends Monitor{
}
class HPMonitor extends Monitor {
}

public class Computer {

    Monitor monitor;

    public Computer() {
        this.monitor = new LGMonitor();
    }

    void changeToHPMonitor() {
        this.monitor = new HPMonitor(); // 안된다.
        // 다양한 모니터를 컴퓨터에서 사용할수 있도록 하는 것이 다형성의 출발
    }
}
