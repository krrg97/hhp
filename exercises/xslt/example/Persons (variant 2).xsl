<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/Persons">
		{
            "persons" : [<xsl:for-each select="Person">
                <xsl:call-template name="person"/>
            </xsl:for-each>]
        }
	</xsl:template> 
    
    <xsl:template name="person">
            {
                "full name" : "<xsl:value-of select="Name"/><xsl:text> </xsl:text><xsl:value-of select="Surname"/>"
            }<xsl:if test="./following-sibling::Person">,</xsl:if>
    </xsl:template>
</xsl:stylesheet>