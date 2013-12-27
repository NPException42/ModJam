package npe.arcade.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import npe.arcade.tileentities.TileEntityArcade;

public class BlockArcadeTop extends BlockArcadeBase {

	public BlockArcadeTop(int id) {
		super(id);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityArcade();
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {
		super.onBlockClicked(world, x, y - 1, z, player);
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		return super.onBlockActivated(world, x, y - 1, z, player, par6, par7, par8, par9);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
		int facing = world.getBlockMetadata(x, y, z);
		float[] bounds = { 0f, 0f, 0f, 1f, 1f, 1f };

		// changing parts of the bounding box depending on the facing
		switch (facing) {

			case 0: {
				bounds[5] = 0.375f;
				break;
			}

			case 1: {
				bounds[0] = 0.625f;
				break;
			}

			case 2: {
				bounds[2] = 0.625f;
				break;
			}

			case 3: {
				bounds[3] = 0.375f;
				break;
			}
		}

		AxisAlignedBB blockbounds = AxisAlignedBB.getAABBPool().getAABB(x + bounds[0], y + bounds[1], z + bounds[2], x + bounds[3], y + bounds[4], z + bounds[5]);
		return blockbounds;
	}
}
