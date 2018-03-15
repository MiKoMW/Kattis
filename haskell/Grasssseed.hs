k :: String -> Double
k line = let [a,b] = map read$words line 
         in  a*b

solve :: String -> String
solve text = let (h:_:ls) = lines text
             in  show ((read h)*(sum$map k$ls))

main :: IO ()
main = interact solve
