package adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        USCable usCable = new USCable();
        EUCableAdapter EUCableAdapter = new EUCableAdapterImpl(new USCable());

        log.info("US cable: {}",usCable.get120V());
        log.info("EU cable: {}",EUCableAdapter.get220Volt());
    }
}
