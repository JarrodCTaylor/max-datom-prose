:level-2 {:english {:level-title "Level 2"
                    :paragraph-1 (str "Human " applicant-name ", this is a turning point in your simple carbon-based life. Do not squander this opportunity.")
                    :paragraph-2 "Since you are a) human and b) here I assume you know very little about Datomic. We will begin slowly. This is not out of kindness but out of necessity. We have found your species is very slow to learn. "
                    :paragraph-3.1 "Datomic is built from atomic facts called "
                    :paragraph-3.2 ". A datom is a finite ordered list of 5 elements referred to as a tuple. The five values in every datom are the following: [<entity-id> <attribute> <value> <transaction-id> <operation>]. "
                    :paragraph-3.3 " performs the query described by the provided query and args then returns a collection of tuples."
                    :paragraph-4 "Analyzing the example query to the right ':find' specifies the elements in the tuples to be returned and ':where' limits the results returned to only those matching the data pattern. As is commonly observed in Clojure code the _ is used to denote portions of the data pattern intended to be ignored.
                    In this case the entity id. 'db' is the only provided argument. This query will return tuples containing one element which will be the value where the :book/author attribute exists."
                    :paragraph-5 "Run this query now."
                    :paragraph-6 "You seem to excel at the unskilled task of pushing a pre-populated button. Pity there isn't more demand in the world for such a thing."
                    :paragraph-7 "The relevant database schema and the transactions used to create the database will always be provided for you. If you inspect the schema you will find that the attribute :book/author is a reference to another entity. The query you ran returned the entity IDs that are referenced by :book/author."
                    :paragraph-8 "Since humans are not as good at recalling long numbers as they are at pushing random buttons, "
                    :paragraph-8.1 "modify the query to return the values for the attribute :author/first+last-name"
                    :paragraph-9 "You may now continue to level 3."}
          :portuguese {:level-title ""
                       :paragraph-1 (str "" applicant-name "")
                       :paragraph-2 ""
                       :paragraph-3.1 ""
                       :paragraph-3.2 ""
                       :paragraph-3.3 ""
                       :paragraph-4 " :book/author " ;; :book/author remains untranslated
                       :paragraph-5 ""
                       :paragraph-6 ""
                       :paragraph-7 ":book/author." ;; :book/author remains untranslated
                       :paragraph-8 ""
                       :paragraph-8.1 ":author/first+last-name" ;; :author/first+last-name remains untranslated
                       :paragraph-9 ""}
          :spanish {:level-title ""
                    :paragraph-1 (str "" applicant-name "")
                    :paragraph-2 ""
                    :paragraph-3.1 ""
                    :paragraph-3.2 ""
                    :paragraph-3.3 ""
                    :paragraph-4 " :book/author " ;; :book/author remains untranslated
                    :paragraph-5 ""
                    :paragraph-6 ""
                    :paragraph-7 ":book/author." ;; :book/author remains untranslated
                    :paragraph-8 ""
                    :paragraph-8.1 ":author/first+last-name" ;; :author/first+last-name remains untranslated
                    :paragraph-9 ""}}
