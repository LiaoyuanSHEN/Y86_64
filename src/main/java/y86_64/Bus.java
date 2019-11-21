package y86_64;

public interface Bus extends Component {

    void registerComponent(long componentId, Component component);

    default <T extends Component> T getComponent(long componentId) {
        return getComponent(componentId, "localhost");
    }

    <T extends Component> T getComponent(long componentId, String host);

}
