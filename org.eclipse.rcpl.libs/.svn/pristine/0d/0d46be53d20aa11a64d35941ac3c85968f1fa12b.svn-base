<?xml version="1.0"?>
<!--
   ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   ====================================================================
-->

<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">

 <xsl:param name="bugtracking-url"/>
 <!-- FIXME : Get the Github URL from properties -->
 <xsl:variable name="github-url" select="'https://github.com/apache/poi'"/>

 <xsl:variable name="bugdetails" select="concat($bugtracking-url, 'show_bug.cgi?id=')"/>
 <xsl:variable name="buglist" select="concat($bugtracking-url, 'buglist.cgi?bug_id=')"/>

 <xsl:template match="devs"/>
 
 <xsl:template match="changes">
  <document>
   <header>
    <title>History of Changes</title>
   </header>
   <body>
    <p><link href="changes.rss"><img src="images/rss.png" alt="RSS"/></link></p>    
    <xsl:apply-templates/>
   </body>
  </document>
 </xsl:template>

 <xsl:template match="release">
  <section id="{@version}">
   <title>Version <xsl:value-of select="@version"/> (<xsl:value-of select="@date"/>)</title>
   <ul>
    <xsl:apply-templates/>
   </ul>
  </section>
 </xsl:template>

 <xsl:template match="action">
  <li>
   <icon src="images/{@type}.jpg" alt="{@type}"/>

   <xsl:text> </xsl:text>

   <xsl:if test="@fixes-bug">
    <xsl:choose>
     <xsl:when test="contains(@fixes-bug, ',')">
      <link href="{$buglist}{translate(normalize-space(@fixes-bug),' ','')}">
       <xsl:text></xsl:text><xsl:value-of select="normalize-space(@fixes-bug)"/>
      </link>
     </xsl:when>
     <xsl:otherwise>
      <xsl:choose>
       <xsl:when test="contains(@fixes-bug, 'github-')">
         <link href="{$github-url}/pull/{translate(@fixes-bug,'github-','')}">
         <xsl:text></xsl:text><xsl:value-of select="@fixes-bug"/>
         </link>
       </xsl:when>
       <xsl:otherwise>
         <link href="{$bugdetails}{@fixes-bug}">
         <xsl:text></xsl:text><xsl:value-of select="@fixes-bug"/>
         </link>
       </xsl:otherwise>
      </xsl:choose>
     </xsl:otherwise>
    </xsl:choose>
    <xsl:text> - </xsl:text>
   </xsl:if>

   <xsl:apply-templates/>

   <xsl:if test="@due-to and @due-to!=''">
    <xsl:text> Thanks to </xsl:text>
    <xsl:choose>
     <xsl:when test="@due-to-email and @due-to-email!=''">
      <link href="mailto:{@due-to-email}">
       <xsl:value-of select="@due-to"/>
      </link>
     </xsl:when>
     <xsl:otherwise>
      <xsl:value-of select="@due-to"/>
     </xsl:otherwise>
    </xsl:choose>
    <xsl:text>.</xsl:text>
   </xsl:if>

  </li>
 </xsl:template>

</xsl:stylesheet>
