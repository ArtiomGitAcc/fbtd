package com.example.fbtd.domain;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;
import java.lang.Override;

@Entity
public class User implements Serializable
{

   @Id
   private @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", updatable = false, nullable = false)
   Long id = null;
   @Version
   private @Column(name = "version")
   int version = 0;

   @Column
   private long facebookID;

   @Column
   private String name;

   @Column
   private String imageURL;

   public Long getId()
   {
      return this.id;
   }

   public void setId(final Long id)
   {
      this.id = id;
   }

   public int getVersion()
   {
      return this.version;
   }

   public void setVersion(final int version)
   {
      this.version = version;
   }

   @Override
   public boolean equals(Object that)
   {
      if (this == that)
      {
         return true;
      }
      if (that == null)
      {
         return false;
      }
      if (getClass() != that.getClass())
      {
         return false;
      }
      if (id != null)
      {
         return id.equals(((User) that).id);
      }
      return super.equals(that);
   }

   @Override
   public int hashCode()
   {
      if (id != null)
      {
         return id.hashCode();
      }
      return super.hashCode();
   }

   public long getFacebookID()
   {
      return this.facebookID;
   }

   public void setFacebookID(final long facebookID)
   {
      this.facebookID = facebookID;
   }

   public String getName()
   {
      return this.name;
   }

   public void setName(final String name)
   {
      this.name = name;
   }

   public String getImageURL()
   {
      return this.imageURL;
   }

   public void setImageURL(final String imageURL)
   {
      this.imageURL = imageURL;
   }

   public String toString()
   {
      String result = "";
      result += facebookID;
      if (name != null && !name.trim().isEmpty())
         result += " " + name;
      if (imageURL != null && !imageURL.trim().isEmpty())
         result += " " + imageURL;
      return result;
   }
}