package com.zettamine.assignment;

import java.io.Serializable;
import java.util.Objects;

public class Certification implements Comparable, Serializable {
		int certId;
		String title;
		int ranking;
		
		public Certification(int certId, String title, int ranking) {
			this.certId  = certId;
			this.title   = title;
			this.ranking = ranking;
		}

		public int getCertId() {
			return certId;
		}


		public void setCertId(int certId) {
			this.certId = certId;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public int getRanking() {
			return ranking;
		}


		public void setRanking(int ranking) {
			this.ranking = ranking;
		}


		@Override
		public int hashCode() {
			return Objects.hash(certId, ranking, title);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Certification other = (Certification) obj;
			return certId == other.certId && ranking == other.ranking && Objects.equals(title, other.title);
		}

		@Override
		public String toString() {
			return "Certification [certId=" + certId + ", title=" + title + ", ranking=" + ranking + "]";
		}

		@Override
		public int compareTo(Object o) {
			Certification c = (Certification)o;
			return this.certId - c.certId ;
		}
		
		
}
