// default package
// Generated 10-may-2014 11:58:30 by Hibernate Tools 3.4.0.CR1

/**
 * TbMicCursosxpensum generated by hbm2java
 */
public class TbMicCursosxpensum implements java.io.Serializable {

	private long nbCpeIdn;
	private TbAdmCurso tbAdmCurso;
	private TbMicVersionpensum tbMicVersionpensum;

	public TbMicCursosxpensum() {
	}

	public TbMicCursosxpensum(long nbCpeIdn, TbAdmCurso tbAdmCurso,
			TbMicVersionpensum tbMicVersionpensum) {
		this.nbCpeIdn = nbCpeIdn;
		this.tbAdmCurso = tbAdmCurso;
		this.tbMicVersionpensum = tbMicVersionpensum;
	}

	public long getNbCpeIdn() {
		return this.nbCpeIdn;
	}

	public void setNbCpeIdn(long nbCpeIdn) {
		this.nbCpeIdn = nbCpeIdn;
	}

	public TbAdmCurso getTbAdmCurso() {
		return this.tbAdmCurso;
	}

	public void setTbAdmCurso(TbAdmCurso tbAdmCurso) {
		this.tbAdmCurso = tbAdmCurso;
	}

	public TbMicVersionpensum getTbMicVersionpensum() {
		return this.tbMicVersionpensum;
	}

	public void setTbMicVersionpensum(TbMicVersionpensum tbMicVersionpensum) {
		this.tbMicVersionpensum = tbMicVersionpensum;
	}

}
