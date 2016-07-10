'XSLT' Exercise
===============

Your task is: transform xml from the 'samples' folder into json. Write a transformation into the 'bands.xsl'. This transformation should transform "The_Beatles.xml" and "Scorpions.xml" into the following form:
{
    "name" : "%band_name",
    "foundation_year" : "%band_foundation_year%",
    "members" : [
        {"full_name" : "%member1_name% %member1_surname%"},
        {"full_name" : "%member2_name% %member2_surname%"}
    ],
    "albums" : [
        {
            "name" : "%album1_name%",
            "year" : "%album1_year%",
            "songs" : [
                {
                    "title" : "%song1_title%",
                    "length" : "%song1_length%"
                },
                {
                    "title" : "%song2_title%",
                    "length" : "%song2_length%"
                }
            ]
        },
        {
            "name" : "%album2_name%",
            "year" : "%album2_year%",
            "songs" : [
                {
                    "title" : "%song1_title%",
                    "length" : "%song1_length%"
                },
                {
                    "title" : "%song2_title%",
                    "length" : "%song2_length%"
                }
            ]
        }
    ]
}

Notice that a comma shouldn't be after the last element of the list (the last member, the last album, the last song, the last element of a JSON). Exapmles in the 'examples' folder show how to do this.
You can write a whole transformation in one template (variant 1 example) or create templates for all complex elements (variant 2 example).

You can check your transformation using some online tool like this: http://xslttest.appspot.com/.