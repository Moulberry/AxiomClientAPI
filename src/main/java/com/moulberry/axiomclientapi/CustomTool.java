package com.moulberry.axiomclientapi;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Camera;
import org.joml.Matrix4f;

public interface CustomTool {

    /**
     * Called whenever the tool is selected/deselected
     * Can also be called manually after an operation is finished
     */
    void reset();

    /**
     * Called every render frame
     */
    void render(Camera camera, float tickDelta, long time, PoseStack poseStack, Matrix4f projection);

    /**
     * Called when the player uses the tool (default keybind: Right Mouse)
     * @return whether to pass the input on to other systems (eg. selection, clipboard)
     */
    boolean callUseTool();

    /**
     * Called when the player 'confirms' something (default keybind: Enter)
     * @return whether to pass the input on to other systems (eg. selection, clipboard)
     */
    boolean callConfirm();

    /**
     * Called when the player 'deletes' something (default keybind: Delete)
     * @return whether to pass the input on to other systems (eg. selection, clipboard)
     */
    boolean callDelete();

    void displayImguiOptions();
    String name();

}
