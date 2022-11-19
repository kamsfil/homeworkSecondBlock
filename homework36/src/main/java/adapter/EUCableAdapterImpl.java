package adapter;

public class EUCableAdapterImpl implements EUCableAdapter {

    private final USCable USCable;

    public EUCableAdapterImpl(USCable USCable) {
       this.USCable = USCable;
   }

    @Override
    public Volt get220Volt() {
        return addAdapter(USCable.get120V());
    }

    private Volt addAdapter(Volt power){
        power.setVolts(power.getVolts() + 100);
        return power;
    }
}
