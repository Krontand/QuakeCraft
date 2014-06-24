package madcreeper.quakecraft.ammo;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityPlasma extends EntityThrowable 
{
		
	public EntityPlasma(World par1World) 
	{
		super(par1World);
	}

	public EntityPlasma(World par1World, EntityLivingBase par2EntityLivingBase) 
	{
		super(par1World, par2EntityLivingBase);
		this.setFire(5);
	}
	
	@Override
	protected float func_70182_d()
	{
	         return 5F;
	}
	
    protected float getGravityVelocity()
    {
        return 0.001F;
    }

	@Override
	protected void onImpact(MovingObjectPosition var1) 
	{
		this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, 1.0F, false, true);
		this.setDead();
	}

}
