package com.joffice.rcpl.plugin.office.databinding.types;

import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.ILayoutObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode;
import org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment;

import com.joffice.rcpl.plugin.office.databinding.JOPropertyColorAndBackground;

public class JOEffects {

	private boolean blurGrow;
	private long blurRad;

	public enum ShadowType {
		NONE, INNER, OUTER;
	}

	private ShadowType shadowType = ShadowType.NONE;

	private long outerShadowBlurRad;
	private int outerShadowDir;
	private long outerShadowDist;
	private int outerShadowKx;
	private int outerShadowKy;
	private boolean outerShadowRotateWithShape;
	private int outerShadowSx;
	private int outerShadowSy;
	private long softEgdeRad;
	@SuppressWarnings("unused")
	private ILayoutObject layoutObject;

	private JOPropertyColorAndBackground<IColor> shadowColor;

	@SuppressWarnings("unused")
	public JOEffects(ILayoutObject layoutObject, CTEffectList effectList) {
		this.layoutObject = layoutObject;
		if (effectList != null) {
			CTBlurEffect blurEffect = effectList.getBlur();
			if (blurEffect != null) {
				blurGrow = blurEffect.getGrow();
				blurRad = blurEffect.getRad();
				CTFillOverlayEffect fillOverlayEffect = effectList
						.getFillOverlay();
				STBlendMode.Enum blendMode = fillOverlayEffect.getBlend();
				fillOverlayEffect.getBlipFill();
				fillOverlayEffect.getGradFill();
				fillOverlayEffect.getGrpFill();
				fillOverlayEffect.getNoFill();
				fillOverlayEffect.getPattFill();
				fillOverlayEffect.getSolidFill();
			}

			CTGlowEffect glowEffect = effectList.getGlow();
			if (glowEffect != null) {
				glowEffect.getHslClr();
				glowEffect.getPrstClr();
				glowEffect.getRad();
				glowEffect.getSchemeClr();
				glowEffect.getScrgbClr();
				glowEffect.getSrgbClr();
				glowEffect.getSysClr();
			}

			CTInnerShadowEffect innerShadowEffect = effectList.getInnerShdw();
			if (innerShadowEffect != null) {
				shadowType = ShadowType.OUTER;
				innerShadowEffect.getBlurRad();
				innerShadowEffect.getDir();
				innerShadowEffect.getDist();
				innerShadowEffect.getHslClr();
				innerShadowEffect.getPrstClr();
				innerShadowEffect.getSchemeClr();
				innerShadowEffect.getScrgbClr();
				innerShadowEffect.getSrgbClr();
				innerShadowEffect.getSysClr();
			}
			CTOuterShadowEffect outerShadowEffect = effectList.getOuterShdw();
			if (outerShadowEffect != null) {
				shadowType = ShadowType.OUTER;
				STRectAlignment.Enum outerShadowRectAlignment = outerShadowEffect
						.getAlgn();
				outerShadowBlurRad = outerShadowEffect.getBlurRad();
				outerShadowDir = outerShadowEffect.getDir();
				outerShadowDist = outerShadowEffect.getDist();
				outerShadowKx = outerShadowEffect.getKx();
				outerShadowKy = outerShadowEffect.getKy();
				outerShadowRotateWithShape = outerShadowEffect
						.getRotWithShape();
				outerShadowSx = outerShadowEffect.getSx();
				outerShadowSy = outerShadowEffect.getSy();

				CTHslColor outerShadowHslColor = outerShadowEffect.getHslClr();
				if (outerShadowHslColor != null) {
					shadowColor = new JOPropertyColorAndBackground<IColor>(
							layoutObject, outerShadowEffect,
							outerShadowHslColor);
				}
				CTPresetColor outerShadowPresetColor = outerShadowEffect
						.getPrstClr();
				if (outerShadowPresetColor != null) {
					shadowColor = new JOPropertyColorAndBackground<IColor>(
							layoutObject, outerShadowEffect,
							outerShadowPresetColor);
				}
				CTSchemeColor outerShadowSchemeColor = outerShadowEffect
						.getSchemeClr();
				if (outerShadowSchemeColor != null) {
					shadowColor = new JOPropertyColorAndBackground<IColor>(
							layoutObject, outerShadowEffect,
							outerShadowSchemeColor);
				}
				CTScRgbColor outerShadowCTScRgbColor = outerShadowEffect
						.getScrgbClr();
				if (outerShadowCTScRgbColor != null) {
					shadowColor = new JOPropertyColorAndBackground<IColor>(
							layoutObject, outerShadowEffect,
							outerShadowCTScRgbColor);
				}
				CTSRgbColor outerShadowCtsRgbColor = outerShadowEffect
						.getSrgbClr();
				if (outerShadowCtsRgbColor != null) {
					shadowColor = new JOPropertyColorAndBackground<IColor>(
							layoutObject, outerShadowEffect,
							outerShadowCtsRgbColor);
				}
				CTSystemColor outerShadowSysColor = outerShadowEffect
						.getSysClr();
				if (outerShadowSysColor != null) {
					shadowColor = new JOPropertyColorAndBackground<IColor>(
							layoutObject, outerShadowEffect,
							outerShadowSysColor);
				}
			}

			CTPresetShadowEffect presetShadowEffect = effectList.getPrstShdw();
			if (presetShadowEffect != null) {
				presetShadowEffect.getDir();
				presetShadowEffect.getDist();
				presetShadowEffect.getHslClr();
				presetShadowEffect.getPrst();
				presetShadowEffect.getPrstClr();
				presetShadowEffect.getSchemeClr();
				presetShadowEffect.getScrgbClr();
				presetShadowEffect.getSchemeClr();
				presetShadowEffect.getScrgbClr();
				presetShadowEffect.getSrgbClr();
				presetShadowEffect.getSysClr();
			}
			CTReflectionEffect reflectionEffect = effectList.getReflection();
			if (reflectionEffect != null) {
				reflectionEffect.getAlgn();
				reflectionEffect.getBlurRad();
				reflectionEffect.getDir();
				reflectionEffect.getDist();
				reflectionEffect.getEndA();
				reflectionEffect.getEndPos();
				reflectionEffect.getFadeDir();
				reflectionEffect.getKx();
				reflectionEffect.getKy();
				reflectionEffect.getRotWithShape();
				reflectionEffect.getStA();
				reflectionEffect.getStPos();
				reflectionEffect.getSx();
				reflectionEffect.getSy();
			}

			CTSoftEdgesEffect softEdgeEffect = effectList.getSoftEdge();
			if (softEdgeEffect != null) {
				softEgdeRad = softEdgeEffect.getRad();
			}
		}
	}

	public boolean isBlurGrow() {
		return blurGrow;
	}

	public void setBlurGrow(boolean blurGrow) {
		this.blurGrow = blurGrow;
	}

	public long getBlurRad() {
		return blurRad;
	}

	public void setBlurRad(long blurRad) {
		this.blurRad = blurRad;
	}

	public ShadowType getShadowType() {
		return shadowType;
	}

	public void setShadowType(ShadowType shadowType) {
		this.shadowType = shadowType;
	}

	public long getOuterShadowBlurRad() {
		return outerShadowBlurRad;
	}

	public void setOuterShadowBlurRad(long outerShadowBlurRad) {
		this.outerShadowBlurRad = outerShadowBlurRad;
	}

	public int getOuterShadowDir() {
		return outerShadowDir;
	}

	public void setOuterShadowDir(int outerShadowDir) {
		this.outerShadowDir = outerShadowDir;
	}

	public long getOuterShadowDist() {
		return outerShadowDist;
	}

	public void setOuterShadowDist(long outerShadowDist) {
		this.outerShadowDist = outerShadowDist;
	}

	public int getOuterShadowKx() {
		return outerShadowKx;
	}

	public void setOuterShadowKx(int outerShadowKx) {
		this.outerShadowKx = outerShadowKx;
	}

	public int getOuterShadowKy() {
		return outerShadowKy;
	}

	public void setOuterShadowKy(int outerShadowKy) {
		this.outerShadowKy = outerShadowKy;
	}

	public boolean isOuterShadowRotateWithShape() {
		return outerShadowRotateWithShape;
	}

	public void setOuterShadowRotateWithShape(boolean outerShadowRotateWithShape) {
		this.outerShadowRotateWithShape = outerShadowRotateWithShape;
	}

	public int getOuterShadowSx() {
		return outerShadowSx;
	}

	public void setOuterShadowSx(int outerShadowSx) {
		this.outerShadowSx = outerShadowSx;
	}

	public int getOuterShadowSy() {
		return outerShadowSy;
	}

	public void setOuterShadowSy(int outerShadowSy) {
		this.outerShadowSy = outerShadowSy;
	}

	public long getSoftEgdeRad() {
		return softEgdeRad;
	}

	public void setSoftEgdeRad(long softEgdeRad) {
		this.softEgdeRad = softEgdeRad;
	}

	public JOPropertyColorAndBackground<IColor> getShadowColor() {
		return shadowColor;
	}

	public void setShadowColor(JOPropertyColorAndBackground<IColor> shadowColor) {
		this.shadowColor = shadowColor;
	}

}
