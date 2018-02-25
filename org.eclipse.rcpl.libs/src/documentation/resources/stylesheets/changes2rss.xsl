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
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:param name="config-file">../../skinconf.xml</xsl:param>
    <xsl:variable name="config" select="document($config-file)/skinconfig" />
    <xsl:variable name="changes-url" select="concat($config/project-url, 'changes.html')" />

    <xsl:template match="changes">
        <rss version="0.91">
            <channel>
                <title>
                    <xsl:value-of select="$config/project-name" />
                    <xsl:text> Changes</xsl:text>
                </title>

                <link>
                    <xsl:value-of select="$changes-url" />
                </link>

                <description>
                    <xsl:value-of select="$config/project-name" />
                    <xsl:text> Changes</xsl:text>
                </description>

                <language>en-us</language>

                <xsl:apply-templates select="release[1]/action"/> 
            </channel>
        </rss>
    </xsl:template>

    <xsl:template match="action">
        <item>
            <title>
                <xsl:value-of select="@context" />
                <xsl:text> </xsl:text>
                <xsl:value-of select="@type" />

                <xsl:if test="@fixes-bug">
                    <xsl:text>(bug </xsl:text>
                    <xsl:value-of select="@fixes-bug" />
                    <xsl:text>)</xsl:text>
                </xsl:if>

            </title>

            <link>
                <xsl:value-of select="$changes-url" />
            </link>

            <description>
                <xsl:value-of select="@context" />
                <xsl:text> </xsl:text>
                <xsl:value-of select="@type" />
                <xsl:text> by </xsl:text>
                <xsl:value-of select="//devs/person[@id=current()/@dev]/@name" />
                <xsl:if test="@fixes-bug">
                    <xsl:text> (bug </xsl:text>
                    <xsl:value-of select="@fixes-bug" />
                    <xsl:text>)</xsl:text>
                </xsl:if>
                <xsl:text> - </xsl:text>
                <xsl:value-of select="." />
                <xsl:if test="@due-to">
                    <xsl:text> Thanks to </xsl:text>
                    <xsl:value-of select="@due-to" />
                    <xsl:text>.</xsl:text>
                </xsl:if>
            </description>
        </item>
    </xsl:template>
</xsl:stylesheet>

