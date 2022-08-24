:level-12 {:english {:level-title "Level 12"
                     :paragraph-1 (str "Human " applicant-name ", the ")
                     :paragraph-1.1 ":xform"
                     :paragraph-1.2 " option provides the ability to transform the value returned by pull for an attribute."
                     :paragraph-2 "For example, if instead of an integer for \"expired batteries\" associated with a given energy farm the requirement is to return a word :xform can be used."
                     :paragraph-3 "(defn int->str [i]\n  (case i\n        0 \"zero\"\n        1 \"one\"\n        2 \"two\"\n        3 \"three\"\n        \"I have been advised not to talk numbers\"))\n\n(d/q '[:find  (pull ?farm [:farm/name [:farm/expired-battery-count :xform ns/int->str]])\n       :where [?farm :farm/name]]\n     db)"
                     :paragraph-5 "Using :xform update the query to return the "
                     :paragraph-5.1 ":user/first+last-name"
                     :paragraph-5.2 " of the post author and a string in the form of "
                     :paragraph-5.3 "Comment Count: <count>"
                     :paragraph-5.4 " for the "
                     :paragraph-5.5 ":post/comments"
                     :paragraph-6 "You may now continue to level 13."}}
