import junit.framework.TestCase;

public class TVTest extends TestCase {

    public void testTurnOn() {
        TV tv = new TV();
        tv.turnOn();
        assertEquals(true, tv.on);
    }

    public void testTurnOff() {
        TV tv = new TV();
        tv.turnOff();
        assertEquals(false,tv.on);
    }

    public void testChannelUp() {
        TV tv = new TV();
        tv.channel = 1;
        tv.channelUp();
        assertEquals(2,tv.channel);
    }

    public void testChannelDown() {
        TV tv = new TV();
        tv.channel = 2;
        tv.channelDown();
        assertEquals(1,tv.channel);
    }

    public void testVolumeUp() {
        TV tv = new TV();
        tv.volumeLevel = 2;
        tv.volumeUp();
        assertEquals(3,tv.volumeLevel);
    }

    public void testVolumeDown() {
        TV tv = new TV();
        tv.volumeLevel = 5;
        tv.volumeDown();
        assertEquals(4,tv.volumeLevel);

    }
}