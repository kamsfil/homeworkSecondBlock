package singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {

        log.info("{}", Singleton.getInstance().getCount());
        log.info("{}", Singleton.getInstance().getCount());
        log.info("{}", Singleton.getInstance().getCount());

    }
}
