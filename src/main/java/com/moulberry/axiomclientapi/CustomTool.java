package com.moulberry.axiomclientapi;

public interface CustomTool {

    /**
     * Called whenever the tool is selected/deselected
     * Can also be called manually after an operation is finished
     */
    default void reset() {}

    /**
     * Called every render frame
     */
    default void render(IAxiomWorldRenderContext rc) {}

    /**
     * Called when the player uses the tool (default keybind: Right Mouse)
     * @return whether to consume the input, preventing it from being passed on
     */
    default boolean callUseTool() {
        return false;
    }

    /**
     * Called when the player 'confirms' something (default keybind: Enter)
     * @return whether to consume the input, preventing it from being passed on
     */
    default boolean callConfirm() {
        return false;
    }

    /**
     * Called when the player 'deletes' something (default keybind: Delete)
     * @return whether to consume the input, preventing it from being passed on
     */
    default boolean callDelete() {
        return false;
    }

    default void displayImguiOptions() {}
    String name();

}
