k :: String -> Int
k line = let [a,b] = map read$words line 
         in  ceiling$a/sin(b*2*pi/360)



out :: [String] -> String
out [] = ""
out (x:xs) = x ++ "\n" ++ out xs


solve :: String -> String
solve text = let (h:ls) = lines text
             in  show$k$h

main :: IO ()
main = interact solve