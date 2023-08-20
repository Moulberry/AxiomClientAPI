package com.moulberry.axiomclientapi.pathers;

import com.moulberry.axiomclientapi.regions.BlockRegion;
import com.moulberry.axiomclientapi.regions.BooleanRegion;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public abstract class BallShape {

    public static BallShape SPHERE = new BallShape() {
        @Override
        public void fillRegion(BlockRegion region, int radius, BlockState block) {
            float maxRadiusSq = (radius + 0.5f) * (radius + 0.5f);
            for (int x = -radius; x <= radius; x++) {
                for (int y = -radius; y <= radius; y++) {
                    for (int z = -radius; z <= radius; z++) {
                        if (x*x + y*y + z*z < maxRadiusSq) {
                            region.addBlock(x, y, z, block);
                        }
                    }
                }
            }
        }

        @Override
        public void fillRegion(BooleanRegion region, int radius) {
            float maxRadiusSq = (radius + 0.5f) * (radius + 0.5f);
            for (int x = -radius; x <= radius; x++) {
                for (int y = -radius; y <= radius; y++) {
                    for (int z = -radius; z <= radius; z++) {
                        if (x*x + y*y + z*z < maxRadiusSq) {
                            region.add(x, y, z);
                        }
                    }
                }
            }
        }

        @Override
        public float distanceSq(int x, int y, int z) {
            return x*x + y*y + z*z;
        }

        @Override
        public String getName() {
            return I18n.get("axiom.tool.shape.sphere");
        }

        @Override
        public int getMaxRadiusForLivePreview() {
            return 25;
        }
    };

    public static BallShape CUBE = new BallShape() {
        @Override
        public void fillRegion(BlockRegion region, int radius, BlockState block) {
            for (int x = -radius; x <= radius; x++) {
                for (int y = -radius; y <= radius; y++) {
                    for (int z = -radius; z <= radius; z++) {
                        region.addBlock(x, y, z, Blocks.STONE.defaultBlockState());
                    }
                }
            }
        }

        @Override
        public void fillRegion(BooleanRegion region, int radius) {
            for (int x = -radius; x <= radius; x++) {
                for (int y = -radius; y <= radius; y++) {
                    for (int z = -radius; z <= radius; z++) {
                        region.add(x, y, z);
                    }
                }
            }
        }

        @Override
        public float distanceSq(int x, int y, int z) {
            return Math.max(x*x, Math.max(y*y, z*z));
        }

        @Override
        public String getName() {
            return I18n.get("axiom.tool.shape.cube");
        }

        @Override
        public int getMaxRadiusForLivePreview() {
            return 20;
        }
    };

    public static BallShape OCTAHEDRON = new BallShape() {
        @Override
        public void fillRegion(BlockRegion region, int radius, BlockState block) {
            for (int x = -radius; x <= radius; x++) {
                for (int y = -radius; y <= radius; y++) {
                    for (int z = -radius; z <= radius; z++) {
                        if (Math.abs(x) + Math.abs(y) + Math.abs(z) <= radius) {
                            region.addBlock(x, y, z, Blocks.STONE.defaultBlockState());
                        }
                    }
                }
            }
        }

        @Override
        public void fillRegion(BooleanRegion region, int radius) {
            for (int x = -radius; x <= radius; x++) {
                for (int y = -radius; y <= radius; y++) {
                    for (int z = -radius; z <= radius; z++) {
                        if (Math.abs(x) + Math.abs(y) + Math.abs(z) <= radius) {
                            region.add(x, y, z);
                        }
                    }
                }
            }
        }

        @Override
        public float distanceSq(int x, int y, int z) {
            float distance = Math.abs(x) + Math.abs(y) + Math.abs(z);
            return distance * distance;
        }

        @Override
        public String getName() {
            return I18n.get("axiom.tool.shape.octahedron");
        }

        @Override
        public int getMaxRadiusForLivePreview() {
            return 35;
        }
    };

    public abstract void fillRegion(BlockRegion region, int radius, BlockState block);
    public abstract void fillRegion(BooleanRegion region, int radius);
    public abstract float distanceSq(int x, int y, int z);
    public abstract String getName();
    public abstract int getMaxRadiusForLivePreview();

    public static BallShape getByIndex(int index) {
        return switch (index) {
            default -> SPHERE;
            case 1 -> CUBE;
            case 2 -> OCTAHEDRON;
        };
    }

    public static String[] getAllNames() {
        return new String[] {
            SPHERE.getName(),
            CUBE.getName(),
            OCTAHEDRON.getName()
        };
    }

}
